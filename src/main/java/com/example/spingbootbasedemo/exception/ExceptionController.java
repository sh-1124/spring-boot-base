package com.example.spingbootbasedemo.exception;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 第二种异常处理方式
 * 只能在本类中使用，针对某个业务逻辑在本类中处理
 */
@RestController
public class ExceptionController {

    @GetMapping("/exception1")
    public String exception1(){
        String msg = null;
        msg.length();
        return "exception1 NullPointException";
    }

   /* @ExceptionHandler(value = {NullPointerException.class})
    public ModelAndView nullPointException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("error",e.toString());
        mv.setViewName("error1");
        return mv;
    }*/

    @GetMapping("/exception2")
    public String exception2(){
        int a = 0;
        int b = 2;
        System.out.println(b/a);
        return "ArithmeticException";
    }

/*    @ExceptionHandler(value = {ArithmeticException.class})
    public ModelAndView arithmeticException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("error",e.toString());
        mv.setViewName("error2");
        return mv;
    }*/
}
