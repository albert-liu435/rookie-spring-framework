package com.rookie.bigdata.designpatterns.state.two;

/**
 * @Class WorkState
 * @Description
 * @Author rookie
 * @Date 2024/12/18 17:20
 * @Version 1.0
 */
public interface WorkState {


    /**
     * 具体的工作情况
     *
     * @param working 工作上下文环境
     */
    void handle(Working working);
}
