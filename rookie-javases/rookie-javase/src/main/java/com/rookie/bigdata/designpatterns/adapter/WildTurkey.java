package com.rookie.bigdata.designpatterns.adapter;

/**
 * @Class WildTurkey
 * @Description
 * @Author rookie
 * @Date 2024/12/12 18:38
 * @Version 1.0
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("gobble!");
    }
}
