package com.rookie.bigdata.designpatterns.proxy.one.statics;

/**
 * @Class ProxySubject
 * @Description 代理类
 * @Author rookie
 * @Date 2024/12/19 10:34
 * @Version 1.0
 */
public class ProxySubject implements Subject{
    private Subject subject;
    public ProxySubject(Subject subject) {
        this.subject = subject;
    }
    @Override
    public void info() {
        perReqs();
        subject.info();
        postReqs();
    }

    private void perReqs(){
        System.out.println("记录请求日志");
    }
    private void postReqs(){
        System.out.println("记录响应日志");
    }

}
