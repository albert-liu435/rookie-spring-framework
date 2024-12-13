package com.rookie.bigdata.chainresponsibility;

/**
 * @Class RenShi
 * @Description 人事
 * @Author rookie
 * @Date 2024/12/13 11:35
 * @Version 1.0
 */
public class RenShi extends AbstractHandler{
    @Override
    protected void conCreteHandle(String request) {
        System.out.println("人事审批: 同意");
    }
}
