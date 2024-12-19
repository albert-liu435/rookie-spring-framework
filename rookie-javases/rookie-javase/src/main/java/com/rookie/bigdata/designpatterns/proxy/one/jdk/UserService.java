package com.rookie.bigdata.designpatterns.proxy.one.jdk;

/**
 * @Class UserService
 * @Description 业务实现类
 * @Author rookie
 * @Date 2024/12/19 10:57
 * @Version 1.0
 */
public class UserService implements IUserService{
    /**
     * 登录
     * @param name
     * @param pwd
     * @return
     */
    @Override
    public boolean login(String name,String pwd) {
        System.out.println(name+":登录成功");
        return true;
    }

    /**
     * 退出
     * @param name
     */
    @Override
    public void signOut(String name) {
        System.out.println(name +": 退出成功");
    }
}
