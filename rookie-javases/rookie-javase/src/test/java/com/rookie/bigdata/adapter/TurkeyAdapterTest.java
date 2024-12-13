package com.rookie.bigdata.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class TurkeyAdapterTest
 * @Description https://pdai.tech/md/dev-spec/pattern/9_adapter.html
 * @Author rookie
 * @Date 2024/12/12 18:39
 * @Version 1.0
 */
class TurkeyAdapterTest {


    @Test
    void test01() {
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.quack();
    }
}
