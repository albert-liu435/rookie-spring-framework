package com.rookie.bigdata.controller;

import com.rookie.bigdata.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Class UserController
 * @Description 自定义参数解析器 https://blog.csdn.net/Sheng_Q/article/details/133231417
 * @Author rookie
 * @Date 2024/11/12 11:55
 * @Version 1.0
 */
@RestController
@Slf4j
public class UserController {


    /**
     * http://localhost:8080/test?name=zhangsan&age=23
     * header中放入token
     * @param user
     * @return
     */
    @GetMapping("/test")
    public Object queryByType(User user) {
        return user;
    }

}
