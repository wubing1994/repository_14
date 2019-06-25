package com.cskaoyan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ComponentScan(basePackages ="com.cskaoyan.controller")
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {

    /*
    * <mvc:intercepters
    * <mvc:resources
    * <mvc:aspectj auto-proxy
    * */
}
