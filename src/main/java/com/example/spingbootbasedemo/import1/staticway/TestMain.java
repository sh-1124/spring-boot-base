package com.example.spingbootbasedemo.import1.staticway;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
        String[] beannames = ac.getBeanDefinitionNames();
        for (String beanname: beannames) {
            System.out.println(beanname);
        }
    }
}
