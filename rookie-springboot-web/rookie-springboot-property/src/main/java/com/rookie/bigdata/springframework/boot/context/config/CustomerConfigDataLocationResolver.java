package com.rookie.bigdata.springframework.boot.context.config;

import org.springframework.boot.context.config.*;
import org.springframework.core.Ordered;

import java.util.List;

/**
 * @Class CustomerConfigDataLocationResolver
 * @Description
 * @Author rookie
 * @Date 2024/9/6 15:03
 * @Version 1.0
 */
public class CustomerConfigDataLocationResolver implements ConfigDataLocationResolver<CustomerConfigDataResource>, Ordered {
    @Override
    public boolean isResolvable(ConfigDataLocationResolverContext context, ConfigDataLocation location) {
        return false;
    }

    @Override
    public List<CustomerConfigDataResource> resolve(ConfigDataLocationResolverContext context, ConfigDataLocation location) throws ConfigDataLocationNotFoundException, ConfigDataResourceNotFoundException {
        return null;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
