package com.example.app.watch.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author root
 * @Date 2019/8/19
 * @Version 1.0.0
 * @Description 控制器注册类
 * @Company www.zxg.cn
 **/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer{

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("/login/login");
        registry.addViewController("/login").setViewName("/login/login");
        //注册首页底部导航栏的相应页面
        registry.addViewController("/images").setViewName("/images/index");
        registry.addViewController("/video").setViewName("/video/index");
        registry.addViewController("/news").setViewName("/news/index");

    }
}
