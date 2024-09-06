package com.rookie.bigdata.springframework.boot.context.config;

import lombok.Data;
import org.springframework.boot.context.config.ConfigDataResource;

/**
 * @Class CustomerConfigDataResource
 * @Description
 * @Author rookie
 * @Date 2024/9/6 14:50
 * @Version 1.0
 */

@Data
public class CustomerConfigDataResource extends ConfigDataResource {

    private String resourceName;

    public CustomerConfigDataResource(boolean optional, String resourceName) {
        super(optional);
        this.resourceName = resourceName;
    }
}
