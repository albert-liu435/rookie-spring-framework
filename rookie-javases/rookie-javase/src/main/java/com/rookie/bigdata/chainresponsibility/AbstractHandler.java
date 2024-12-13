package com.rookie.bigdata.chainresponsibility;

/**
 * @Class AbstractHandler
 * @Description
 * @Author rookie
 * @Date 2024/12/13 11:31
 * @Version 1.0
 */
public abstract class AbstractHandler {

    protected AbstractHandler next;

    public AbstractHandler getNext() {
        return next;
    }

    public void setNext(AbstractHandler next) {
        this.next = next;
    }

    protected void handle(String request) {
        conCreteHandle(request);
        if (getNext() == null) {
            System.out.println("流程结束");
        } else {
            getNext().handle(request);
        }
    }

    protected abstract void conCreteHandle(String request);


}
