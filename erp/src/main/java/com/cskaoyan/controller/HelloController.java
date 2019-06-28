package com.cskaoyan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


/**
 * @Desc
 * @Author xushuai
 * @CreateTime 2019/6/27 14:26
 **/
@Controller
public class HelloController {

    @RequestMapping("login")
    public String login() {
        return "login";
    }

    @RequestMapping("home")
    public String home(HttpServletRequest request) {
        List<String> sysPermissionList = new ArrayList<>();

        sysPermissionList.add("deviceType:add");
        sysPermissionList.add("deviceType:edit");
        sysPermissionList.add("deviceType:delete");

        sysPermissionList.add("device:add");
        sysPermissionList.add("device:edit");
        sysPermissionList.add("device:delete");

        sysPermissionList.add("deviceFault:add");
        sysPermissionList.add("deviceFault:edit");
        sysPermissionList.add("deviceFault:delete");

        request.getSession().setAttribute("sysPermissionList", sysPermissionList);
        return "home";
    }
}
