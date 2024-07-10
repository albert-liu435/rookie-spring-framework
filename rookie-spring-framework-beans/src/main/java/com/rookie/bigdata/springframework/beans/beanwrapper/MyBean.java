package com.rookie.bigdata.springframework.beans.beanwrapper;

import java.nio.file.Path;
import java.util.Date;

/**
 * @Class MyBean
 * @Description
 * @Author rookie
 * @Date 2024/7/10 14:49
 * @Version 1.0
 */
public class MyBean {

    private Path path;

    private Date date;

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "path=" + path +
                ", date=" + date +
                '}';
    }
}
