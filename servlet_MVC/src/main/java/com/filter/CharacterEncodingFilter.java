package com.filter;


import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init CharacterEncodingFilter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=utf-8");

        System.out.println("Before CharacterEncodingFilter");
        filterChain.doFilter(servletRequest, servletResponse);  // let the request pass through the filter, otherwise the program will stuck here
        System.out.println("After CharacterEncodingFilter");
    }

    @Override
    public void destroy() {
        System.out.println("destroy CharacterEncodingFilter");
    }
}
