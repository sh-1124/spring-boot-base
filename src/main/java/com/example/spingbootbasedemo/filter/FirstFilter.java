package com.example.spingbootbasedemo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/first")
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init ------");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("过滤器之前");
        chain.doFilter(request,response);
        System.out.println("过滤器之后");
    }

    @Override
    public void destroy() {
        System.out.println("destroy ----");
    }
}
