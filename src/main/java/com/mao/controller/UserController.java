package com.mao.controller;

import com.mao.entity.User;
import com.mao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@ResponseBody
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/list")
    public List<User> listUser(){
        List<User> users = userMapper.listUser();
        return users;
    }
}
