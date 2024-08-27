package com.rookie.bigdata.springframework.aop.anno.compon;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Class DataTask
 * @Description
 * @Author rookie
 * @Date 2024/6/28 16:11
 * @Version 1.0
 */
@Component
@Slf4j
public class DataTask {
    @SneakyThrows
    public String syncData() {
        log.info("start sync data");
//        if(true){
//            throw new Exception("exception");
//        }
        return "success";
    }
}
