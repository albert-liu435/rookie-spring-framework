package com.rookie.bigdata.springframework.context.annotation.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Class CustomerOnClassCondition
 * @Description
 * @Author rookie
 * @Date 2024/9/6 10:47
 * @Version 1.0
 */
public class CustomerOnClassCondition implements Condition {


    private final String className;

    public CustomerOnClassCondition(String className) {
        this.className = className;
    }


    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        try {
            // 尝试加载类
            getClass().getClassLoader().loadClass(className);
            // 类存在，条件匹配
            return true;
        } catch (ClassNotFoundException e) {
            // 类不存在，条件不匹配
            return false;
        }
    }
}
