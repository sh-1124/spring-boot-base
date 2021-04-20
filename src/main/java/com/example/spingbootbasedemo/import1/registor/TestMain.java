package com.example.spingbootbasedemo.import1.registor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@MyImportRegistor
public class TestMain {

    public static void main(String[] args) {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestMain.class);
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for(String bean : beanDefinitionNames){
            System.out.println(bean);
        }

    }

}
