package com.rookie.bigdata.springframework.context.annotation.imports.registrar;

import com.rookie.bigdata.springframework.context.annotation.imports.bean.Person;
import com.rookie.bigdata.springframework.context.annotation.imports.bean.User;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Class MyImportBeanDefinitionRegistrar
 * @Description
 * @Author rookie
 * @Date 2024/6/28 11:06
 * @Version 1.0
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {


    /**
     * @param importingClassMetadata 标注了@Import注解类的所有注解信息
     * @param registry               BeanDefinition注册类，可将需要添加到容器的Bean,通过调用BeanDefinitionRegistry.registerBeanDefinition手工注册
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        //判断容器中是否存在name为Persion的Bean，存在返回true，不存在返回false
        boolean persion = registry.containsBeanDefinition("Persion");

        //不存在则手动注册Bean
        if (!persion) {

            //根据类获取Bean的信息
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Person.class);

            //第一个参数是Bean的名称，第二个参数是Bean的信息
            registry.registerBeanDefinition("Persion", rootBeanDefinition);
        }
        //判断容器中是否存在name为User的Bean，存在返回true，不存在返回false
        boolean user = registry.containsBeanDefinition("User");

        //不存在则手动注册Bean
        if (!user) {

            //根据类获取Bean的信息
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(User.class);

            //第一个参数是Bean的名称，第二个参数是Bean的信息
            registry.registerBeanDefinition("User", rootBeanDefinition);
        }


    }

}
