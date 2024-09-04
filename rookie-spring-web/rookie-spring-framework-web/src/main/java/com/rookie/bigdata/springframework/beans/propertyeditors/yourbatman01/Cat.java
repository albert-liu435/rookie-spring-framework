package com.rookie.bigdata.springframework.beans.propertyeditors.yourbatman01;

import lombok.Data;

import java.util.UUID;

/**
 * @Class Cat
 * @Description
 * @Author rookie
 * @Date 2024/9/4 18:01
 * @Version 1.0
 */
@Data
public class Cat extends Animal{

    private UUID uuid;
}
