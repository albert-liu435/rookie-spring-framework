package com.rookie.bigdata.springframework.web.method.support;

import com.rookie.bigdata.domain.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.time.LocalDateTime;

/**
 * @Class MyArgumentResolver
 * @Description
 * @Author rookie
 * @Date 2024/11/12 13:48
 * @Version 1.0
 */
public class MyArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getParameterType().equals(User.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        User user = new User();
        HttpServletRequest request = (HttpServletRequest) webRequest.getNativeRequest();
        user.setName(request.getParameter("name"));
        user.setAge(Integer.parseInt(request.getParameter("age")));
        user.setToken(request.getHeader("token"));
        user.setTime(LocalDateTime.now());
        return user;
    }
}
