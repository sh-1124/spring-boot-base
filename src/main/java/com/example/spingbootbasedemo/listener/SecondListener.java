package com.example.spingbootbasedemo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class SecondListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println(sce.getServletContext().getInitParameterNames());
        System.out.println("servletContext初始化了 2222-------");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext 销毁了-22222-----");
    }
}
