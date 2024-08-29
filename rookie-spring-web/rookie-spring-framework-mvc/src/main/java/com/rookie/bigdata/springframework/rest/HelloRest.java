package com.rookie.bigdata.springframework.rest;

import com.rookie.bigdata.springframework.server.PrintServer;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author rookie
 * @Description
 * @Date 2024/8/29 23:17
 * @Version 1.0
 */
@RestController
public class HelloRest {
    @Autowired
    private PrintServer printServer;

    @GetMapping(path = {"hello", "welcome"}, produces = "text/html;charset=UTF-8")
    public String sayHello(HttpServletRequest request) {
        printServer.print();
        return "hello, " + request.getParameter("name");
    }


    @GetMapping({"/", ""})
    public String index() {
        return UUID.randomUUID().toString();
    }
}
