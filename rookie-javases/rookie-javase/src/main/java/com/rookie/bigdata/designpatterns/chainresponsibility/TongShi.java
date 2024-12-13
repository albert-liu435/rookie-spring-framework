package com.rookie.bigdata.designpatterns.chainresponsibility;

/**
 * @Class TongShi
 * @Description 同事
 * @Author rookie
 * @Date 2024/12/13 11:36
 * @Version 1.0
 */
public class TongShi extends AbstractHandler{
    @Override
    protected void conCreteHandle(String request) {
        System.out.println("同事审批：同意");
    }
}
