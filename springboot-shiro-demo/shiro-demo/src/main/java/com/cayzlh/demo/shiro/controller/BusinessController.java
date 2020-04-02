package com.cayzlh.demo.shiro.controller;

import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenanyu
 * @date 2019-04-30.
 */
@RestController
@RequestMapping("/api/business/")
public class BusinessController {

    @GetMapping("showAll")
    @RequiresAuthentication
    @RequiresRoles("admin")
    public String showAll() {
        return "show all.";
    }

    @GetMapping("showJava")
    @RequiresAuthentication
    @RequiresRoles("java")
    public String showJava() {
        return "show java";
    }

    @GetMapping("showNavicat")
    @RequiresAuthentication
    @RequiresPermissions("navicat")
    public String showNavicat(){
        return "show navicat";
    }

}
