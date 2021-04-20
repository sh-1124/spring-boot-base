package com.example.spingbootbasedemo.filter;

import javax.servlet.*;
import java.io.IOException;

public class SecondFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init 2------");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("过滤器之前2");
        chain.doFilter(request,response);
        System.out.println("过滤器之后2");
    }

    @Override
    public void destroy() {
        System.out.println("destroy 2----");
    }
}
