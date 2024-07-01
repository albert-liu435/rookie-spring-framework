package com.rookie.bigdata.springframework.context.annotation.conditional;

import com.rookie.bigdata.springframework.context.annotation.configuration.MyConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author rookie
 * @Description
 * @Date 2024/7/1 20:54
 * @Version 1.0
 */
class SystemBeanConfigTest {

    @Test
    void test01() {
        //加载配置类
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SystemBeanConfig.class);

        //获取成功注册到容器中的所有Bean的名称
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();

        //遍历Bean的名称
        for (String name : beanDefinitionNames) {
            java.lang.System.out.println(name);
        }
    }


    @Test
    public void test2() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SystemBeanConfig.class);

        String osName = applicationContext.getEnvironment().getProperty("os.name");
        java.lang.System.out.println(osName);
        Map<String, System> beans = applicationContext.getBeansOfType(System.class);
        java.lang.System.out.println(beans);
    }

}


}