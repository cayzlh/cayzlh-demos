package com.cayzlh.common.shiro.config;

import com.cayzlh.common.shiro.bean.UserInfo;
import com.cayzlh.common.shiro.service.AuthorizingService;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

/**
 * @author chenanyu
 * @date 2019-04-23.
 */
@Slf4j
public class CustomRealm extends AuthorizingRealm {

    @Autowired
    @Lazy
    private AuthorizingService authorizingService;

    /**
     * Shiro 的权限授权是通过继承AuthorizingRealm抽象类，重载doGetAuthorizationInfo();
     * 当访问到页面的时候，链接配置了相应的权限或者 Shiro 标签才会执行此方法否则不会执行，
     * 所以如果只是简单的身份认证没有权限的控制的话，那么这个方法可以不进行实现，直接返回 null 即可。
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = (String) super.getAvailablePrincipal(principalCollection);
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        Set<String> roles = authorizingService.findRoleListByUsername(username);
        authorizationInfo.setRoles(roles);
        roles.forEach(role -> {
            Set<String> permissions = authorizingService.findPermissionsByRole(roles);
            authorizationInfo.addStringPermissions(permissions);
        });
        return authorizationInfo;
    }

    /**
     * 在认证、授权内部实现机制中都有提到，最终处理都将交给Real进行处理。
     * 因为在 Shiro 中，最终是通过 Realm 来获取应用程序中的用户、角色及权限信息的。
     * 通常情况下，在 Realm 中会直接从我们的数据源中获取 Shiro 需要的验证信息。
     * 可以说，Realm 是专用于安全框架的 DAO. Shiro 的认证过程最终会交由 Realm 执行，
     * 这时会调用 Realm 的getAuthenticationInfo(token)方法。
     *
     * 该方法主要执行以下操作:
     *
     * 1、检查提交的进行认证的令牌信息
     * 2、根据令牌信息从数据源(通常为数据库)中获取用户信息
     * 3、对用户信息进行匹配验证。
     * 4、验证通过将返回一个封装了用户信息的AuthenticationInfo实例。
     * 5、验证失败则抛出AuthenticationException异常信息。
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
            throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        UserInfo user = authorizingService.selectByUserName(username);
        if (null == user) {
            throw new UnknownAccountException("doGetAuthenticationInfo() has an UnknownAccountException: "+username);
        }
        String passwordInToken = new String(token.getPassword());
        String passwordInDb = user.getPassword();
        if (!StringUtils.equals(passwordInDb, passwordInToken)) {
            throw new IncorrectCredentialsException("doGetAuthenticationInfo() has an IncorrectCredentialsException: "+username);
        }
        return new SimpleAuthenticationInfo(username, passwordInToken, ByteSource.Util.bytes(user.getSalt()), getName());
    }
}
