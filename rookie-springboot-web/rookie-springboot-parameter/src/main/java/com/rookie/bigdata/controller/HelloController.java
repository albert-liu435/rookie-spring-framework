package com.rookie.bigdata.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Class HelloController
 * @Description
 * @Author rookie
 * @Date 2024/8/7 15:09
 * @Version 1.0
 */
@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {

    /**
     * localhost:8888/hello/resource/hello
     *
     * @param appid
     * @return
     */
    @RequestMapping("/resource/{appid}")
    public String endpointApp(@PathVariable(value = "appid") String appid) {
        log.info("appid:{}", appid);
        return "endpoint";
    }

}
