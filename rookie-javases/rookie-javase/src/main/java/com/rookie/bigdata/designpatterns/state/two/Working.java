package com.rookie.bigdata.designpatterns.state.two;

/**
 * @Class Working
 * @Description
 * @Author rookie
 * @Date 2024/12/18 17:21
 * @Version 1.0
 */
public class Working {
    /**
     * 当前工作状态
     */
    private WorkState concurrentState;

    /**
     * 当前时刻
     */
    private int clock;

    public Working(WorkState concurrentState) {
        this.concurrentState = concurrentState;
    }

    public void writeCode() {
        concurrentState.handle(this);
    }

    public WorkState getConcurrentState() {
        return concurrentState;
    }

    public void setConcurrentState(WorkState concurrentState) {
        this.concurrentState = concurrentState;
    }

    public int getClock() {
        return clock;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }
}
