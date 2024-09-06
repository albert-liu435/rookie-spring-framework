package com.rookie.bigdata.springframework.boot.context.event;

import com.rookie.bigdata.domain.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

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

    @Override
    public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext, ConfigurableEnvironment environment) {

        Student student = bootstrapContext.get(Student.class);
        log.info("student:{}",student.toString());

//        System.out.println("表示已经开始读取配置文件");
//        //配置文件到程序，再然后放入springboot容器
//        Properties properties=new Properties();
//        try {
//            //读取properties容器
//            properties.load(this.getClass().getClassLoader().getResourceAsStream("my.properties"));
//            //读取名字为my
//            PropertySource propertySource=new PropertiesPropertySource("my",properties) ;
//            //加载资源到springboot容器
//            MutablePropertySources propertySources=environment.getPropertySources();
//            propertySources.addLast(propertySource);
//            //换种思路，如果你配置文件是放在网络上，可以直接读取放入我们的项目中
//
//        } catch (IOException e) {
//            System.out.println("出错");
//        }
    }

    @Override
    public void started(ConfigurableApplicationContext context, Duration timeTaken) {
        log.info("表示初始化容器已经结束");

    }

}
