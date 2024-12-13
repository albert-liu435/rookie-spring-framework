package com.rookie.bigdata.designpatterns.command.co;

/**
 * @Class Receiver
 * @Description 接收者
 * @Author rookie
 * @Date 2024/12/13 11:56
 * @Version 1.0
 */
public interface Receiver {
    /**
     * 接收者执行具体的命令内容
     */
    void action();
}
