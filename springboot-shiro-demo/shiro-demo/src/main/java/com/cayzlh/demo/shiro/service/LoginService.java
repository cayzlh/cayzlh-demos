package com.cayzlh.demo.shiro.service;

import com.cayzlh.demo.shiro.bo.in.LoginInBo;
import com.cayzlh.demo.shiro.vo.LoginVo;
import com.cayzlh.common.shiro.service.AuthorizingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenanyu
 * @date 2019-04-30.
 */
@Service
public class LoginService {

    @Autowired
    private AuthorizingService authorizingService;

    public LoginVo login(LoginInBo inBo) {
        String token = authorizingService.login(inBo.getUsername(), inBo.getPassword());
        return LoginVo.builder().username(inBo.getUsername()).token(token).build();
    }

    public String logout() {
        authorizingService.logout();
        return "success";
    }


}
