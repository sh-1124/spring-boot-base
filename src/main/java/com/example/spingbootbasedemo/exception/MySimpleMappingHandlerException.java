package com.example.spingbootbasedemo.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 第三种全局异常处理方式
 * 自定义的全局异常解析器
 */
@Component
public class MySimpleMappingHandlerException  extends AbstractHandlerExceptionResolver {
    @Override
    protected ModelAndView doResolveException(HttpServletRequest request,
                                              HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mv = new ModelAndView();
        System.out.println("自定义的全局异常处理器");
        if (ex instanceof NullPointerException ){
            mv.addObject("error",ex.toString());
            mv.setViewName("error1");
            return mv;
        }else if (ex instanceof  ArithmeticException){
            mv.addObject("error",ex.toString());
            mv.setViewName("error2");
            return mv;
        }else {
            mv.setViewName("error");
        return mv;
        }
    }
}
