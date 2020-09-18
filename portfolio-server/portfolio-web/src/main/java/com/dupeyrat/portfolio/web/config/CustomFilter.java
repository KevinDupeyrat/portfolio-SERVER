package com.dupeyrat.portfolio.web.config;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest,
                                    HttpServletResponse httpServletResponse,
                                    FilterChain filterChain) throws ServletException, IOException {
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE, PATCH");
        httpServletResponse.setHeader("Access-Control-Allow-Headers",
                "authorization, content-type, xsrf-token, Cache-Control, remember-me, WWW-Authenticate");
        httpServletResponse.addHeader("Access-Control-Expose-Headers", "xsrf-token");
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
