package com.rookie.bigdata.designpatterns.chainresponsibility;

/**
 * @Class QingJia
 * @Description 请假
 * @Author rookie
 * @Date 2024/12/13 11:35
 * @Version 1.0
 */
public class QingJia extends AbstractHandler {
    @Override
    protected void conCreteHandle(String request) {
        System.out.println(request);
    }
}
