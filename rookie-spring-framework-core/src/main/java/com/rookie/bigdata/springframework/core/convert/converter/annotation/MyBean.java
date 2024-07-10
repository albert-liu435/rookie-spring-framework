package com.rookie.bigdata.springframework.core.convert.converter.annotation;

import java.util.Date;

/**
 * @Class MyBean
 * @Description
 * @Author rookie
 * @Date 2024/7/10 15:20
 * @Version 1.0
 */
public class MyBean {

    @DateFormat("yyyy-MM-dd")
    private Date date;

    @DateFormat("yyyy-MM-dd hh:mm:ss")
    private Date dateTime;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "date=" + date +
                ", dateTime=" + dateTime +
                '}';
    }
}
