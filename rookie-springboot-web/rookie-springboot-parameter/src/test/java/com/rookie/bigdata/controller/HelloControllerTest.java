package com.rookie.bigdata.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @Class HelloControllerTest
 * @Description
 * @Author rookie
 * @Date 2024/8/7 15:10
 * @Version 1.0
 */
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("dev")
@Slf4j
class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void endpointApp() throws Exception {
        ResultActions resultActions = this.mvc.perform(get("/hello/resource/jon"))
                .andExpect(status().isOk());
        String contentAsString = resultActions.andReturn().getResponse().getContentAsString();
        log.info("请求响应为:{}",contentAsString);

    }
}
