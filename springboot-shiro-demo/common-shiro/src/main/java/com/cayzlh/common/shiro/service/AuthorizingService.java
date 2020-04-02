package com.cayzlh.common.shiro.service;

import com.cayzlh.common.shiro.dao.PermissionDao;
import com.google.common.collect.Sets;
import com.cayzlh.common.shiro.bean.UserInfo;
import com.cayzlh.common.shiro.dao.RoleDao;
import com.cayzlh.common.shiro.dao.UserDao;
import java.util.HashSet;
import java.util.Set;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenanyu
 * @date 2019-04-29.
 */
@Service
public class AuthorizingService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private PermissionDao permissionDao;

    public UserInfo selectByUserName(String username) {
        return userDao.selectByUsername(username);
    }

    public Set<String> findRoleListByUsername(String username) {
        return roleDao.selectByUsername(username);
    }

    public Set<String> findPermissionsByRole(Set<String> roles) {
        HashSet<String> permissions = Sets.newHashSet();
        roles.forEach(role -> permissions.addAll(permissionDao.selectByRole(role)));
        return permissions;
    }

    public String login(String username, String password) {
        UsernamePasswordToken token = new UsernamePasswordToken(username,
                password);
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.login(token);
        currentUser.getSession().setTimeout(60 * 60 * 1000);
        return currentUser.getSession().getId().toString();
    }

    public void logout() {
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.logout();
    }
}
