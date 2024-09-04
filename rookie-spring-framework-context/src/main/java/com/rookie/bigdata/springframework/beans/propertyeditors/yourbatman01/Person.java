package com.rookie.bigdata.springframework.beans.propertyeditors.yourbatman01;

import lombok.Data;

/**
 * @Class Person
 * @Description
 * @Author rookie
 * @Date 2024/9/4 18:01
 * @Version 1.0
 */
@Data
public class Person {
    private Long id;
    private String name;
    private Cat cat;
}


//现在的需求场景是：
//
//UUID类型统一交给UUIDEditor处理（当然包括Cat里面的UUID类型）
//Person类里面的Cat的UUID类型，需要单独特殊处理，因此格式不一样需要“特殊照顾”
//很明显这就需要两个不同的属性编辑器来实现，然后组织起来协同工作。Spring内置了UUIDEditor可以处理一般性的UUID类型（通用），而Person 专用的 UUID编辑器，自定义如下：
