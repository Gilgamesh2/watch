package com.example.app.watch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author root
 * @Date 2019/8/19
 * @Version 1.0.0
 * @Description
 * @Company www.newtouch.cn
 **/
@Controller(value = "loginController")
public class Login extends BaseController {
    @RequestMapping(value = "/hello")
    public  String login(){
        return "index/hello";
    }

}
