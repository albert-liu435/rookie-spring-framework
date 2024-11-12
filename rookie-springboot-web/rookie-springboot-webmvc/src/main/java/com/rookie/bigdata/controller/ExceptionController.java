package com.rookie.bigdata.controller;

import com.rookie.bigdata.lang.ClientException;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.logging.log4j.util.Strings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Class ExceptionController
 * @Description https://blog.csdn.net/Sheng_Q/article/details/131302378
 * http://localhost:8080/api/demo
 * @Author rookie
 * @Date 2024/11/12 14:16
 * @Version 1.0
 */
@RestController
@RequestMapping("/api")
public class ExceptionController {


    @GetMapping("/demo")
    public String demo(HttpServletRequest request) {
        if (Strings.isEmpty(request.getHeader("Authorization"))) {
            throw new ClientException("Auth failed.");
        }
        return "success";
    }
}
