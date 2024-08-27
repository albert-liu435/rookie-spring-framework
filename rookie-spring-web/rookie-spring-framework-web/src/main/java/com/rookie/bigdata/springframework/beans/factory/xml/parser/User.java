package com.rookie.bigdata.springframework.beans.factory.xml.parser;

/**
 * @Class User
 * @Description
 * @Author rookie
 * @Date 2024/8/26 17:38
 * @Version 1.0
 */
public class User {

    private String userName;

    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
