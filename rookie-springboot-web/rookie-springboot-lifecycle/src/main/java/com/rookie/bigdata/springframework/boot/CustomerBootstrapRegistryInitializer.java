package com.rookie.bigdata.springframework.boot;

import com.rookie.bigdata.domain.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.BootstrapRegistry;
import org.springframework.boot.BootstrapRegistryInitializer;

/**
 * @Class CustomerBootstrapRegistryInitializer
 * @Description 参考spring-cloud-alibaba中的ConfigServerBootstrapper
 * @Author rookie
 * @Date 2024/9/3 17:20
 * @Version 1.0
 */
@Slf4j
public class CustomerBootstrapRegistryInitializer implements BootstrapRegistryInitializer {
    @Override
    public void initialize(BootstrapRegistry registry) {

//        if (restTemplateFactory != null) {
//            registry.register(RestTemplate.class, restTemplateFactory::apply);
//        }
//        if (loaderInterceptor != null) {
//            registry.register(LoaderInterceptor.class, BootstrapRegistry.InstanceSupplier.of(loaderInterceptor));
//        }

        log.info("调用CustomerBootstrapRegistryInitializer#initialize");
        Student student=new Student();
        student.setStudentNo(123);
        student.setName("abc");

        registry.registerIfAbsent(Student.class, BootstrapRegistry.InstanceSupplier.of(student));

    }
}
