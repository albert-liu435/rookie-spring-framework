package com.rookie.bigdata.designpatterns.state.two;

/**
 * @Class EveningState
 * @Description
 * @Author rookie
 * @Date 2024/12/18 17:23
 * @Version 1.0
 */
public class EveningState implements WorkState {
    @Override
    public void handle(Working working) {
        if (working.getClock() < 23) {
            System.out.println("加班疲惫写代码");
        } else {
            working.setConcurrentState(work -> {
                System.out.println("别再写了，程序员回家了，明早再试吧😢，现在都已经" + work.getClock() + "点了。放过他吧");
            });
            working.writeCode();
        }
    }
}
