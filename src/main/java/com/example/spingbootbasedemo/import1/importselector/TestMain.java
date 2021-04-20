package com.example.spingbootbasedemo.import1.importselector;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@ShImportSelector
public class TestMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestMain.class);
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for(String beanname : beanDefinitionNames){
            System.out.println(beanname);
        }
    }
}
