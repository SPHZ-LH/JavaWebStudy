package com.sphz.filter;

import javax.servlet.*;
import java.io.IOException;

public class CharterEncodingFilter implements Filter {

    //初始化
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CharterEncodingFilter初始化");
    }

    //执行
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=utf-8");

        System.out.println("CharterEncodingFilter执行前");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("CharterEncodingFilter执行后");

    }

    //销毁
    @Override
    public void destroy() {
        System.out.println("CharterEncodingFilter销毁");
    }
}
