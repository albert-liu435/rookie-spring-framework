package com.rookie.bigdata.springframework.beans.factory.aware;

/**
 * @Class Awareuser
 * @Description
 * @Author rookie
 * @Date 2024/7/1 15:30
 * @Version 1.0
 */
public class Awareuser {
    private String username;
    private String address;

    public Awareuser() {
    }

    public Awareuser(String username, String address) {
        this.username = username;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public void init(){
        System.out.println("执行初始化方法");
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
