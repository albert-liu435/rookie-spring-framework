package com.rookie.bigdata.designpatterns.state.two;

/**
 * @Class MorningState
 * @Description
 * @Author rookie
 * @Date 2024/12/18 17:23
 * @Version 1.0
 */
public class MorningState implements WorkState {
    @Override
    public void handle(Working working) {
        if (working.getClock() < 12) {
            System.out.println("精神抖擞写代码");
        } else {
            working.setConcurrentState(new NoonState());
            working.writeCode();
        }
    }
}

