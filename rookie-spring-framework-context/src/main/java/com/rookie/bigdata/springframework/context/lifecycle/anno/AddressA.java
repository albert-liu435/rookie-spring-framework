package com.rookie.bigdata.springframework.context.lifecycle.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Class AddressA
 * @Description
 * @Author rookie
 * @Date 2024/7/1 10:04
 * @Version 1.0
 */
@Component
public class AddressA {

    private LocationA location;

    @Autowired
    public AddressA(LocationA location) {
        this.location = location;
    }

}
