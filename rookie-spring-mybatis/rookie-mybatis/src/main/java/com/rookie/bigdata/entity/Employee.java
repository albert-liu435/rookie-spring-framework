package com.rookie.bigdata.entity;

/**
 * @Class Employee
 * @Description
 * @Author rookie
 * @Date 2024/11/25 18:24
 * @Version 1.0
 */
public class Employee {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
