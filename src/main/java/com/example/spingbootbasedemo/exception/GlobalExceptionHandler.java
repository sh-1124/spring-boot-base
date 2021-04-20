package com.example.spingbootbasedemo.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * 第三种异常处理方式
 * 第一种全局异常处理方式
 * 全局异常集中处理,将异常处理和业务逻辑解耦
 */
@ControllerAdvice
public class GlobalExceptionHandler {

/*    @ExceptionHandler(value = {NullPointerException.class})
    public ModelAndView nullPointException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("error",e.toString());
        mv.setViewName("error1");
        return mv;
    }


    @ExceptionHandler(value = {ArithmeticException.class})
    public ModelAndView arithmeticException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("error",e.toString());
        mv.setViewName("error2");
        return mv;
    }*/
}
