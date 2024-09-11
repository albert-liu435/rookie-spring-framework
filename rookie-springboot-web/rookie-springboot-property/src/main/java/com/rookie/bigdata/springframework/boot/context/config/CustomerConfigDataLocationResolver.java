package com.rookie.bigdata.springframework.boot.context.config;

import org.springframework.boot.context.config.*;
import org.springframework.core.Ordered;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class CustomerConfigDataLocationResolver
 * @Description
 * @Author rookie
 * @Date 2024/9/6 15:03
 * @Version 1.0
 */
public class CustomerConfigDataLocationResolver implements ConfigDataLocationResolver<CustomerConfigDataResource>, Ordered {

    public static final String PREFIX = "cdl:";

    @Override
    public boolean isResolvable(ConfigDataLocationResolverContext context, ConfigDataLocation location) {
        return location.hasPrefix(PREFIX);
    }

    @Override
    public List<CustomerConfigDataResource> resolve(ConfigDataLocationResolverContext context, ConfigDataLocation location) throws ConfigDataLocationNotFoundException, ConfigDataResourceNotFoundException {
        // 1. 从 location 中读取区别文件
        // 2. 将文件内容构造成功   MyConfigDataResource
        // 3. 返回读取结果
        List<CustomerConfigDataResource> locations = new ArrayList<>();
        String resourceName = location.getValue().substring(PREFIX.length());
        CustomerConfigDataResource myConfigDataResource = new CustomerConfigDataResource(false, resourceName);
        locations.add(myConfigDataResource);
        return locations;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
