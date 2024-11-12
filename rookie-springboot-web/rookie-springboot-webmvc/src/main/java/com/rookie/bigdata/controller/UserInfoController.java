package com.rookie.bigdata.controller;

import com.rookie.bigdata.domain.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Class UserInfoController
 * @Description
 * @Author rookie
 * @Date 2024/11/12 13:58
 * @Version 1.0
 */
@RestController
@RequestMapping("/api/user")
public class UserInfoController {

    @GetMapping("/query")
    public UserInfo query() {
        return new UserInfo().setName("test_sy").setId(28);
    }

}
