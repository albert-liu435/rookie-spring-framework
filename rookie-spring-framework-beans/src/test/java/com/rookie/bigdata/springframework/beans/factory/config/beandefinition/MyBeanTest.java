package com.rookie.bigdata.springframework.beans.factory.config.beandefinition;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.SimpleMetadataReaderFactory;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class MyBeanTest
 * @Description https://github.com/xuchengsheng/spring-reading?tab=readme-ov-file
 * @Author rookie
 * @Date 2024/7/10 17:48
 * @Version 1.0
 */
class MyBeanTest {

    @Test
    void testBeanDefinition() throws Exception{
        DefaultListableBeanFactory beanFactory=new DefaultListableBeanFactory();
        beanFactory.registerBeanDefinition("myBean",createBeanDefinition());

        // 获取MyBean
        MyBean myChildBean = beanFactory.getBean("myBean", MyBean.class);
        // 打印Bean对象
        System.out.println("MyBean = " + myChildBean);
        // 销毁myBean
        beanFactory.destroySingleton("myBean");

    }


    @Test
    void testBeanDefinitionHolder()throws Exception{
        // 创建一个 DefaultListableBeanFactory，它是 BeanDefinitionRegistry 的一个实现
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 创建一个新的 BeanDefinition 对象
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(MyBean.class);

        // Bean名称
        String beanName = "myBean";
        // 设置别名（aliases）
        String[] aliases = {"myBeanX", "myBeanY"};
        // 创建一个 BeanDefinitionHolder，将 BeanDefinition 与名称关联起来
        BeanDefinitionHolder beanDefinitionHolder = new BeanDefinitionHolder(beanDefinition, beanName, aliases);

        // 使用 BeanDefinitionReaderUtils 注册 BeanDefinitionHolder
        BeanDefinitionReaderUtils.registerBeanDefinition(beanDefinitionHolder, beanFactory);

        System.out.println("myBean = " + beanFactory.getBean("myBean"));
        System.out.println("myBeanX = " + beanFactory.getBean("myBeanX"));
        System.out.println("myBeanY = " + beanFactory.getBean("myBeanY"));
    }


    @Test
    void testBeanDefinitionRegistry()throws Exception{
        // 创建一个BeanFactory，它是BeanDefinitionRegistry
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 创建一个Bean定义
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(MyBean.class);

        // 注册Bean定义到BeanFactory
        beanFactory.registerBeanDefinition("myBean", beanDefinition);

        // 获取BeanDefinition
        BeanDefinition retrievedBeanDefinition = beanFactory.getBeanDefinition("myBean");
        System.out.println("Bean定义的类名 = " + retrievedBeanDefinition.getBeanClassName());

        // 检查Bean定义是否存在
        boolean containsBeanDefinition = beanFactory.containsBeanDefinition("myBean");
        System.out.println("Bean定义是否包含(myBean) = " + containsBeanDefinition);

        // 获取所有Bean定义的名称
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        System.out.println("Bean定义的名称 = " + String.join(", ", beanDefinitionNames));

        // 获取Bean定义的数量
        int beanDefinitionCount = beanFactory.getBeanDefinitionCount();
        System.out.println("Bean定义的数量 = " + beanDefinitionCount);

        // 检查Bean名称是否已被使用
        boolean isBeanNameInUse = beanFactory.isBeanNameInUse("myBean");
        System.out.println("Bean名称(myBean)是否被使用 = " + isBeanNameInUse);

        // 移除Bean定义
        beanFactory.removeBeanDefinition("myBean");
        System.out.println("Bean定义已被移除(myBean)");
    }


    private static BeanDefinition createBeanDefinition() throws IOException {
        SimpleMetadataReaderFactory metadataReaderFactory = new SimpleMetadataReaderFactory();
        MetadataReader metadataReader = metadataReaderFactory.getMetadataReader(MyBean.class.getName());

        ScannedGenericBeanDefinition beanDefinition = new ScannedGenericBeanDefinition(metadataReader);
        beanDefinition.setScope("singleton");
        beanDefinition.setLazyInit(true);
        beanDefinition.setPrimary(true);
        beanDefinition.setAbstract(false);
        beanDefinition.setInitMethodName("init");
        beanDefinition.setDestroyMethodName("destroy");
        beanDefinition.setAutowireCandidate(true);
        beanDefinition.setRole(BeanDefinition.ROLE_APPLICATION);
        beanDefinition.setDescription("This is a custom bean definition");
        beanDefinition.setResourceDescription("com.rookie.bigdata.springframework.beans.factory.config.beandefinition");
        beanDefinition.getPropertyValues().add("name", "lex");
        beanDefinition.getPropertyValues().add("age", "18");
        return beanDefinition;
    }
}
