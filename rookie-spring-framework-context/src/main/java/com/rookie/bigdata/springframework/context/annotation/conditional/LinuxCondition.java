package com.rookie.bigdata.springframework.context.annotation.conditional;

/**
 * @Author rookie
 * @Description TODO
 * @Date 2024/7/1 20:54
 * @Version 1.0
 */
public class LinuxCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String property = conditionContext.getEnvironment().getProperty("os.name");
        return property != null && property.contains("Linux");
    }
}
