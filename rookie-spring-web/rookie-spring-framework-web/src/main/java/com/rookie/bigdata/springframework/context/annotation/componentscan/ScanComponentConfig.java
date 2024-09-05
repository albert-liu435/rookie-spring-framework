package com.rookie.bigdata.springframework.context.annotation.componentscan;

import com.rookie.bigdata.springframework.context.annotation.componentscan.base.ExcludeComponent;
import com.rookie.bigdata.springframework.context.annotation.componentscan.filter.CustomFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @Class ScanComponentConfig
 * @Description
 * @Author rookie
 * @Date 2024/9/5 11:48
 * @Version 1.0
 */
//@ComponentScan 注解提供了 includeFilters 和 excludeFilters 属性，你可以使用这些过滤器来精确控制哪些组件会被扫描和注册到 Spring 容器中。
//在上述示例中，我们使用 @ComponentScan 注解的 includeFilters 属性添加了两个过滤器：
//
//第一个过滤器使用 FilterType.ANNOTATION 类型和 MyAnnotation.class 注解类，它将只包含带有 MyAnnotation 注解的组件。
//第二个过滤器使用 FilterType.REGEX 类型和正则表达式 ".*ServiceImpl"，它将只包含名称以 “ServiceImpl” 结尾的组件。
//同时，我们还使用 @ComponentScan 注解的 excludeFilters 属性添加了一个过滤器：
//
//这个过滤器使用 FilterType.ASSIGNABLE_TYPE 类型和 ExcludeComponent.class 类，它将排除继承或实现了 ExcludeComponent 类的组件。
//根据你的需求，你可以使用不同的过滤器类型（FilterType.ANNOTATION、FilterType.REGEX、FilterType.ASSIGNABLE_TYPE 等）来定义自己的过滤规则。这样你就可以控制哪些组件会被扫描和注册到 Spring 容器中。
//@Configuration
//@ComponentScan(basePackages = "com.rookie.bigdata.springframework.context.annotation.componentscan.base",
//        includeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class),
//                @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*ServiceImpl"),
//                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = CustomFilter.class)
//        },
//        excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = ExcludeComponent.class)
//)
@Configuration
@ComponentScan(basePackages = "com.rookie.bigdata.springframework.context.annotation.componentscan",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class),
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*ServiceImpl"),
                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {CustomFilter.class})
        },
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = ExcludeComponent.class),
        useDefaultFilters = false
)
public class ScanComponentConfig {
}
