package com.rookie.bigdata.designpatterns.state.three;

/**
 * @Class HealthState
 * @Description 状态接口实现类, 健康状态下的行为：唱、跳、rap
 * @Author rookie
 * @Date 2024/12/18 18:40
 * @Version 1.0
 */
public class HealthState implements State {
    @Override
    public void action() {
        System.out.println("实习一坤年的健康练习生会：唱、跳、rap");
    }
}
