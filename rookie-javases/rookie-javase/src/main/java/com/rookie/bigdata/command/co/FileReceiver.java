package com.rookie.bigdata.command.co;

/**
 * @Class FileReceiver
 * @Description
 * @Author rookie
 * @Date 2024/12/13 11:56
 * @Version 1.0
 */
public class FileReceiver implements Receiver {

    @Override
    public void action() {
        System.out.println("新增文件");
    }
}
