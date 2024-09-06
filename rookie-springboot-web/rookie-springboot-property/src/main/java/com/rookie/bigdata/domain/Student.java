package com.rookie.bigdata.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Class Student
 * @Description
 * @Author rookie
 * @Date 2024/9/3 17:25
 * @Version 1.0
 */
@Data
public class Student implements Serializable {

    private Long id;

    private int studentNo;

    private String name;

    private Integer age;

    private Date birthDate;

}
