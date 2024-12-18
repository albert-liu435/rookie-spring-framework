package com.rookie.bigdata.designpatterns.state.two;

/**
 * @Class AfterNoonState
 * @Description
 * @Author rookie
 * @Date 2024/12/18 17:23
 * @Version 1.0
 */
public class AfterNoonState implements WorkState {
    @Override
    public void handle(Working working) {
        if (working.getClock() < 17) {
            System.out.println("状态一般写代码");
        } else {
            working.setConcurrentState(new EveningState());
            working.writeCode();
        }
    }
}
