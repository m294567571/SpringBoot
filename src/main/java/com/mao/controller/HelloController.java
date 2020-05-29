package com.mao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.Arrays;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    //通过controller跳转首页需要模板引擎的支持,常用的就是thymeleaf
    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("msg","hello");
        model.addAttribute("users", Arrays.asList("AAA","BBB"));
        return "index";
    }

}
