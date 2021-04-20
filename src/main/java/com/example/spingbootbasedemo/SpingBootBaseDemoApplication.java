package com.example.spingbootbasedemo;

import com.example.spingbootbasedemo.filter.SecondFilter;
import com.example.spingbootbasedemo.listener.SecondListener;
import com.example.spingbootbasedemo.servlet.SecondServlet;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

//@ServletComponentScan(basePackages = {"com.example.spingbootbasedemo.servlet"})
@ServletComponentScan()
@SpringBootApplication
public class SpingBootBaseDemoApplication {

    public static void main(String[] args) {
        //设置关闭Banner
        //user2增加了B功能
        SpringApplication springApplication = new SpringApplication(SpingBootBaseDemoApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);

    }

    @Bean
    public ServletRegistrationBean  servletRegistrationBean(){
        //封装一下
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new SecondServlet());
        registrationBean.addUrlMappings("/second");
        registrationBean.setName("servlet2");
        return registrationBean;
    }


    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new SecondFilter());
        List<String> urlPatterns = new ArrayList<>();
        urlPatterns.add("/second");
        filterRegistrationBean.setUrlPatterns(urlPatterns);
        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean(){
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean(new SecondListener());
        return bean;
    }


    /**
     * 第2中全局异常配置方式
     * 简化了全局异常处理器的配置
     * @return 全局异常处理器
     */
/*    @Bean
    public SimpleMappingExceptionResolver simpleMappingExceptionResolver(){
        SimpleMappingExceptionResolver mapping = new SimpleMappingExceptionResolver();
        Properties mappings = new Properties();
        mappings.setProperty("java.lang.NullPointerException","error1");
        mappings.setProperty("java.lang.ArithmeticException","error2");
        mapping.setExceptionMappings(mappings);
        return mapping;
    }*/

}
