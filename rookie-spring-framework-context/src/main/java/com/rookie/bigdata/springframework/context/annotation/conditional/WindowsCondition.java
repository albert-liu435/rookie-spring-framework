package com.rookie.bigdata.springframework.context.annotation.conditional;

/**
 * @Author rookie
 * @Description TODO
 * @Date 2024/7/1 20:54
 * @Version 1.0
 */
public class WindowsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //获得当前系统名
        String property = conditionContext.getEnvironment().getProperty("os.name");
        //包含Windows则说明是windows系统，返回true
        return property != null && property.contains("Windows");
    }
}
