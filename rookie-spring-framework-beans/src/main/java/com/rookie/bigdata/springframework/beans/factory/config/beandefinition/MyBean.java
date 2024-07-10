package com.rookie.bigdata.springframework.beans.factory.config.beandefinition;

/**
 * @Class MyBean
 * @Description
 * @Author rookie
 * @Date 2024/7/10 17:47
 * @Version 1.0
 */
public class MyBean {

    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void init(){
        System.out.println("execute com.rookie.bigdata.springframework.beans.factory.config.beandefinition.MyBean.init");
    }

    public void destroy(){
        System.out.println("execute com.rookie.bigdata.springframework.beans.factory.config.beandefinition.MyBean.destroy");
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
