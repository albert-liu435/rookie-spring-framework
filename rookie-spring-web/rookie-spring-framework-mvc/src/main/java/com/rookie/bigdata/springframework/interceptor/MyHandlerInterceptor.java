package com.rookie.bigdata.springframework.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Class MyHandlerInterceptor
 * @Description 自定义HandlerInterceptor接口的实现类
 * @Author rookie
 * @Date 2024/9/2 14:15
 * @Version 1.0
 */
@Slf4j
@Component
public class MyHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("-------[Interceptor] preHandle-------");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("-------[Interceptor] postHandle-------");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("-------[Interceptor] afterCompletion-------");
    }
}
