package com.rookie.bigdata.domain;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Class User
 * @Description
 * @Author rookie
 * @Date 2024/11/12 11:56
 * @Version 1.0
 */
@Data
public class User {
    private String name;

    private Integer age;

    private String token;

    private LocalDateTime time;
}
