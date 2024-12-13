package com.rookie.bigdata.adapter;

/**
 * @Class TurkeyAdapter
 * @Description
 * @Author rookie
 * @Date 2024/12/12 18:38
 * @Version 1.0
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }


    @Override
    public void quack() {
        turkey.gobble();
    }
}
