package com.rookie.bigdata.designpatterns.observer.jdkob;

import java.util.Observable;

/**
 * @Class Producer
 * @Description https://blog.csdn.net/weixin_39827506/article/details/114463130
 * @Author rookie
 * @Date 2024/12/19 11:15
 * @Version 1.0
 */
public class Producer extends Observable {

    @Override
    public synchronized void setChanged() {
        super.setChanged();
    }

}
