package com.example.spingbootbasedemo.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    User user;

    @GetMapping("/user")
    public String  getUser(){
        return user.toString();
    }

}
