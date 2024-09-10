package com.rookie.bigdata.springframework.beans.factory.config.postprocessor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @Class User
 * @Description
 * @Author rookie
 * @Date 2024/9/5 10:50
 * @Version 1.0
 */
@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Slf4j
public class User {

    private String name;

    public User() {
    }

    public User(String name) {
        log.error("构造User对象");
        this.name = name;
    }
}
