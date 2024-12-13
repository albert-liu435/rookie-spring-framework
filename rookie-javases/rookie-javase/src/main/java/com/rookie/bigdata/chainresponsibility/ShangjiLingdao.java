package com.rookie.bigdata.chainresponsibility;

/**
 * @Class ShangjiLingdao
 * @Description 上级领导
 * @Author rookie
 * @Date 2024/12/13 11:36
 * @Version 1.0
 */
public class ShangjiLingdao extends AbstractHandler{
    @Override
    protected void conCreteHandle(String request) {
        System.out.println("上级领导审批");
    }
}
