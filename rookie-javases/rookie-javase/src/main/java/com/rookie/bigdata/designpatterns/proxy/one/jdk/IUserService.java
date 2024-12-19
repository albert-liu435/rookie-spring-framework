package com.rookie.bigdata.designpatterns.proxy.one.jdk;

/**
 * @Class IUserService
 * @Description 业务服务接口
 * @Author rookie
 * @Date 2024/12/19 10:56
 * @Version 1.0
 */
public interface IUserService {
    boolean login(String name,String pwd);
    void signOut(String name);
}
