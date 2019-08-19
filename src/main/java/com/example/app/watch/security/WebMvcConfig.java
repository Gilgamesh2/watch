package com.example.app.watch.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author root
 * @Date 2019/8/19
 * @Version 1.0.0
 * @Description
 * @Company www.newtouch.cn
 **/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer{

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("/login/login");
        registry.addViewController("/login").setViewName("/login/login");

    }
}
