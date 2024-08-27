package com.rookie.bigdata.springframework.aop.xml;

import lombok.extern.slf4j.Slf4j;

/**
 * @Class EnhanceLog
 * @Description
 * @Author rookie
 * @Date 2024/6/28 15:46
 * @Version 1.0
 */
@Slf4j
public class EnhanceLog {
    public void beforeExec() {
        log.info("before exec");
    }

    public void afterExec() {
        log.info("after exec");
    }
}

