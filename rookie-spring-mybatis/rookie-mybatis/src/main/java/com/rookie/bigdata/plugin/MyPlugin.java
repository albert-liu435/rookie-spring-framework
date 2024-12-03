package com.rookie.bigdata.plugin;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * @Class MyPlugin
 * @Description
 * @Author rookie
 * @Date 2024/11/27 9:57
 * @Version 1.0
 */
public class MyPlugin implements Interceptor {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 这里是每次执行操作的时候，都会进行这个拦截器的方法内
     */
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        BoundSql boundSql = statementHandler.getBoundSql();
        String sql = boundSql.getSql();
        logger.info("mybatis intercept sql: {}", sql);
        return invocation.proceed(); // 执行原方法
    }

    /**
     * 包装目标对象 为目标对象创建代理对象
     *
     * @Param 要拦截的对象
     * @Return 代理对象
     */
    @Override
    public Object plugin(Object target) {
        System.out.println("将要包装的目标对象：" + target);
        return Plugin.wrap(target, this);
    }

    /**
     * 插件初始化的时候调用，也只调用一次，插件配置的属性从这里设置进来
     */
    @Override
    public void setProperties(Properties properties) {
        System.out.println("插件配置的初始化参数：" + properties);
    }
}
