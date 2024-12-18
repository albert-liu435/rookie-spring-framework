package com.rookie.bigdata.designpatterns.state.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class WorkingTest
 * @Description
 * @Author rookie
 * @Date 2024/12/18 17:24
 * @Version 1.0
 */
class WorkingTest {
    @Test
    void writeCode() {
        Working working = new Working(new MorningState());
        // 手动模拟不同时刻
        working.setClock(9);
        working.writeCode();

        working.setClock(12);
        working.writeCode();

        working.setClock(15);
        working.writeCode();

        working.setClock(21);
        working.writeCode();


        working.setClock(24);
        working.writeCode();
    }
}
