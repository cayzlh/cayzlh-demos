package com.cayzlh.demo.shiro.controller;

import com.cayzlh.demo.shiro.bo.in.LoginInBo;
import com.cayzlh.demo.shiro.service.LoginService;
import com.cayzlh.demo.shiro.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenanyu
 * @date 2019-04-30.
 */
@RestController
@RequestMapping("/api/auth/")
public class AuthController {

    @Autowired
    private LoginService loginService;

    @PostMapping("login")
    public LoginVo login(@RequestBody @Validated LoginInBo inBo) {
        return loginService.login(inBo);
    }

    @GetMapping("logout")
    public String logout() {
        return loginService.logout();

    }

}
