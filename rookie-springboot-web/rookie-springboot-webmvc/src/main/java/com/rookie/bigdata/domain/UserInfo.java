package com.rookie.bigdata.domain;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Class UserInfo
 * @Description
 * @Author rookie
 * @Date 2024/11/12 13:58
 * @Version 1.0
 */
@Data
@Accessors(chain = true)
public class UserInfo {
    private Integer id;

    private String name;
}
