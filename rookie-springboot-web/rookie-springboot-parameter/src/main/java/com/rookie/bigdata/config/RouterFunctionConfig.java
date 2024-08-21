package com.rookie.bigdata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.*;

/**
 * @Class RouterFunctionConfig
 * @Description
 * @Author rookie
 * @Date 2024/8/7 17:52
 * @Version 1.0
 */

@Configuration
public class RouterFunctionConfig {

    @Bean
    RouterFunction<ServerResponse> route() {

        /**
         * localhost:8080/test03
         */
        return RouterFunctions.route()
                .GET("/test03", request -> ServerResponse.ok().body("hello test03"))
//                .GET("/test02", new HandlerFunction<ServerResponse>() {
//                    @Override
//                    public ServerResponse handle(ServerRequest request) throws Exception {
//
//                        return null;
//                    }
//                })
                .build();
    }

}
