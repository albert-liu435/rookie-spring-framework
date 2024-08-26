package com.rookie.bigdata.springframework.context.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Class ObjectEvent
 * @Description
 * @Author rookie
 * @Date 2024/8/26 9:33
 * @Version 1.0
 */
public class ObjectEvent /*extends ApplicationEvent*/ {

    private String name;


    public ObjectEvent() {

    }

//    public ObjectEvent(Object source) {
//        super(source);
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
