package com.rookie.bigdata.designpatterns.state.three;

/**
 * @Class Context
 * @Description 环境类
 * @Author rookie
 * @Date 2024/12/18 18:41
 * @Version 1.0
 */
public class Context {
    //持有状态接口的引用
    private State state;

    public Context(State state) {
        this.state = state;
    }
    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.action(); // 委托给当前状态处理请求
    }
}
