package com.rookie.bigdata.designpatterns.composite.decision;

/**
 * @Class User
 * @Description 决策树中使用的用户信息
 * @Author rookie
 * @Date 2024/12/13 15:53
 * @Version 1.0
 */
public class User {

    private Gender gender;
    private int age;
    private Object more;

    public User(Gender gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Object getMore() {
        return more;
    }

    public void setMore(Object more) {
        this.more = more;
    }
}
