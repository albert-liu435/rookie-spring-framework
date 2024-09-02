package com.rookie.bigdata.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rookie.bigdata.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Class StudentController
 * @Description
 * @Author rookie
 * @Date 2024/9/2 14:51
 * @Version 1.0
 */
@RestController
public class StudentController {


    @Autowired
    private ObjectMapper mapper;

    @RequestMapping(value = "/serialization", method = RequestMethod.GET)
    public Student serialization() throws JsonProcessingException {

        Student student = new Student();
        student.setId(100L);
        student.setName("zhagnsan");
        student.setAge(23);
        student.setStudentNo(10);
        student.setBirthDate(new Date());

        System.out.println(mapper.writeValueAsString(student));

        return student;
    }


    @RequestMapping(value = "/deserialization"/*, method = RequestMethod.PUT*/)
    public String deserialization(@RequestBody Student student) {
        return student.toString();
    }

}
