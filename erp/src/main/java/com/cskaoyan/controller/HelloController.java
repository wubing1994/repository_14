package com.cskaoyan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Desc
 * @Author xushuai
 * @CreateTime 2019/6/27 14:26
 **/
@Controller
public class HelloController {
    @RequestMapping("home")
    public String visitHome(){
        return "home";
    }
}