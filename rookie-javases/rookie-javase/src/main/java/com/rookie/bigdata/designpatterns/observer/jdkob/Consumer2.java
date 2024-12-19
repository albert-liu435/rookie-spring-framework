package com.rookie.bigdata.designpatterns.observer.jdkob;

import java.util.Observable;
import java.util.Observer;

/**
 * @Class Consumer2
 * @Description
 * @Author rookie
 * @Date 2024/12/19 11:17
 * @Version 1.0
 */
public class Consumer2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("我是 consumer2 我收到了" + o + "的通知，通知内容：" + arg);
    }
}
