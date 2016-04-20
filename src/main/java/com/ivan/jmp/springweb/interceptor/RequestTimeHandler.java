package com.ivan.jmp.springweb.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Иван on 19.04.2016.
 */
@Component
public class RequestTimeHandler extends HandlerInterceptorAdapter {
    private static final Logger logger = LoggerFactory.getLogger(RequestTimeHandler.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);

        String browser = request.getHeader("User-Agent");
        logger.info("Browser: {}", browser);

        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        long startTime = (long) request.getAttribute("startTime");
        long endTime = System.currentTimeMillis();

        logger.info("Request's {} execution time is: {}s", request.getRequestURI(), (double)(endTime - startTime) / 1000);
    }
}
