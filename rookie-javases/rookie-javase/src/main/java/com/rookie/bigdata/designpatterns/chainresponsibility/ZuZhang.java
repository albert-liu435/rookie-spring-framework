package com.rookie.bigdata.designpatterns.chainresponsibility;

/**
 * @Class ZuZhang
 * @Description 组长
 * @Author rookie
 * @Date 2024/12/13 11:44
 * @Version 1.0
 */
public class ZuZhang extends AbstractHandler {
    @Override
    protected void conCreteHandle(String request) {
        System.out.println("组长审批：同意");
    }
}
