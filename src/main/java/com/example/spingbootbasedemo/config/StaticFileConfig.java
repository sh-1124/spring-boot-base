package com.example.spingbootbasedemo.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 第四种加载第三方静态文件的方式
 */
public class StaticFileConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler().addResourceLocations("E:/........");
        super.addResourceHandlers(registry);
    }
}
