package com.rookie.bigdata.springframework.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @Author rookie
 * @Description
 * @Date 2024/8/29 23:17
 * @Version 1.0
 */
@Slf4j
@Component
public class MyRefererInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        log.info("------- in my referer interceptor -----------");
        String referer = request.getHeader("referer");
        if (StringUtils.isEmpty(referer) || !referer.startsWith("http://hhui.top")) {
            return false;
        }

        return true;
    }
}
