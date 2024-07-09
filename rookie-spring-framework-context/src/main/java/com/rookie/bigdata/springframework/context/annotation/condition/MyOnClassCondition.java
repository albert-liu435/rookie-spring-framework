package com.rookie.bigdata.springframework.context.annotation.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Class MyOnClassCondition
 * @Description
 * @Author rookie
 * @Date 2024/7/9 10:39
 * @Version 1.0
 */
public class MyOnClassCondition implements Condition {

    private final String className;

    public MyOnClassCondition(String className) {
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
