package com.example.spingbootbasedemo.import1.staticway;

import com.example.spingbootbasedemo.import1.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(User.class)
public class JavaConfig {



}
