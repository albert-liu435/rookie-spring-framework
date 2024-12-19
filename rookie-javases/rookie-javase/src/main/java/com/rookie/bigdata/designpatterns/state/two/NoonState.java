package com.rookie.bigdata.designpatterns.state.two;

/**
 * @Class NoonState
 * @Description
 * @Author rookie
 * @Date 2024/12/18 17:22
 * @Version 1.0
 */
public class NoonState implements WorkState {
    @Override
    public void handle(Working working) {
        if (working.getClock() < 13) {
            System.out.println("饿了困了写代码");
        } else {
            working.setConcurrentState(new AfterNoonState());
            working.writeCode();
        }
    }
}
