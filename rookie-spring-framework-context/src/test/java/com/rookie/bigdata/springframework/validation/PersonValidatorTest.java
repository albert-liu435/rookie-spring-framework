package com.rookie.bigdata.springframework.validation;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.FieldError;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class PersonValidatorTest
 * @Description https://github.com/xuchengsheng/spring-reading
 * @Author rookie
 * @Date 2024/7/10 14:34
 * @Version 1.0
 */
@Slf4j
class PersonValidatorTest {

    @Test
    void validate() {
        //创建一个Person对象实例
        Person person=new Person();
        person.setName(null);
//        person.setName("zhangsan");
        person.setAge(130);

        //创建一个BeanPropertyBindingResult对象，用于存储验证过程中的错误
        BeanPropertyBindingResult result=new BeanPropertyBindingResult(person,"person");

        //创建一个PersonValidator实例，，只是自定义的验证器
        PersonValidator validator=new PersonValidator();

        //检查PersonValidator是否支持Person类的验证
        if(validator.supports(person.getClass())){
            //执行验证逻辑
            validator.validate(person,result);
        }

        // 检查是否存在验证错误，并打印出所有的字段错误
        if (result.hasErrors()) {
            for (FieldError error : result.getFieldErrors()) {
                System.out.println(error.getField() + ":" + error.getDefaultMessage());
            }
        }
    }
}
