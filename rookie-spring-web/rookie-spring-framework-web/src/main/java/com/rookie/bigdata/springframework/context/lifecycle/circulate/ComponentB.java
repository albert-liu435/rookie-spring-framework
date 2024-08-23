package com.rookie.bigdata.springframework.context.lifecycle.circulate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Class ComponentB
 * @Description
 * @Author rookie
 * @Date 2024/8/23 16:21
 * @Version 1.0
 */
@Component
public class ComponentB {

    @Autowired
    private ComponentA componentA;
}
