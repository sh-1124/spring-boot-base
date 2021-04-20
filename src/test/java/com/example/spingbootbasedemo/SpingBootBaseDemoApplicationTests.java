package com.example.spingbootbasedemo;

import com.example.spingbootbasedemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpingBootBaseDemoApplicationTests {

    @Autowired
    UserService userService;
    

    @Test
    public void contextLoads() {
        System.out.println(userService.getUser());
    }

}
