package com.rookie.bigdata.designpatterns.factory.method;

/**
 * @Class AbstractGraphicalFactory
 * @Description 抽象工厂
 * @Author rookie
 * @Date 2024/12/13 16:42
 * @Version 1.0
 */
public abstract class AbstractGraphicalFactory {
//    Logger logger = LoggerFactory.getLogger(AbstractGraphicalFactory.class);

    /**
     * 创建一个图形
     *
     * @return 具体图形
     */
    public abstract Graphical creat();
}

