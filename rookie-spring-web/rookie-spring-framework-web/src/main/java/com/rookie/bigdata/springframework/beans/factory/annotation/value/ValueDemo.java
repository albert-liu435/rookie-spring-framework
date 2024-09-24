package com.rookie.bigdata.springframework.beans.factory.annotation.value;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Class ValueDemo
 * @Description
 * @Author rookie
 * @Date 2024/9/24 9:20
 * @Version 1.0
 */
@Data
@Component
public class ValueDemo {

    private String valueName="test a @Values";
}
