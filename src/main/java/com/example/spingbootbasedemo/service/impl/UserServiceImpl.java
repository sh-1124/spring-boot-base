package com.example.spingbootbasedemo.service.impl;

import com.example.spingbootbasedemo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUser() {
        return "user";
    }
}
