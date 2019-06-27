package com.cskaoyan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("login")
    public String login() {
        return "login";
    }

    @RequestMapping("home")
    public String home() {
        return "home";
    }
}
