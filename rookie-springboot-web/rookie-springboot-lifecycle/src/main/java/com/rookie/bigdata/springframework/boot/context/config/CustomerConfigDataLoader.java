package com.rookie.bigdata.springframework.boot.context.config;

import com.rookie.bigdata.domain.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.context.config.*;


import java.io.IOException;


/**
 * @Class CustomerConfigDataLoader
 * @Description
 * @Author rookie
 * @Date 2024/9/3 17:21
 * @Version 1.0
 */
@Slf4j
public class CustomerConfigDataLoader implements ConfigDataLoader<CustomerConfigDataResource> {
    @Override
    public ConfigData load(ConfigDataLoaderContext context, CustomerConfigDataResource resource) throws IOException, ConfigDataResourceNotFoundException {

        ConfigurableBootstrapContext bootstrapContext = context.getBootstrapContext();
        Student student = bootstrapContext.get(Student.class);
        log.info("student:{}",student.toString());


        return null;
    }
}
