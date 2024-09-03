package com.rookie.bigdata.springframework.boot.context.event;

import com.rookie.bigdata.domain.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplicationRunListener;

/**
 * @Author rookie
 * @Description
 * @Date 2024/9/3 20:41
 * @Version 1.0
 */
@Slf4j
public class CustomerSpringApplicationRunListener implements SpringApplicationRunListener {


    @Override
    public void starting(ConfigurableBootstrapContext bootstrapContext) {
        Student student = bootstrapContext.get(Student.class);
        log.info("student:{}",student.toString());
    }
}
