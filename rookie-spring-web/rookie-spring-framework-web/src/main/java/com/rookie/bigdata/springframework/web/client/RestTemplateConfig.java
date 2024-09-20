package com.rookie.bigdata.springframework.web.client;

import okhttp3.OkHttpClient;

import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.util.Timeout;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

/**
 * @Class RestTemplateConfig
 * @Description
 * @Author rookie
 * @Date 2024/9/20 10:42
 * @Version 1.0
 */
@Configuration
public class RestTemplateConfig {

//    @Bean
//    RestTemplate restTemplate(){
//        return new RestTemplate();
//    }


//    @ConditionalOnMissingBean(RestTemplate.class)
    @Bean
    public RestTemplate restTemplate(){
        RestTemplate restTemplate = new RestTemplate(getClientHttpRequestFactory());
        return restTemplate;
    }

    /**
     * 使用HttpClient作为底层客户端
     *
     * @return
     */
    private ClientHttpRequestFactory getClientHttpRequestFactory() {
//        int timeout = 5000;
        Timeout timeout=Timeout.of(5000,TimeUnit.MICROSECONDS);
        RequestConfig config = RequestConfig.custom()
                .setConnectTimeout(timeout)
                .setConnectionRequestTimeout(timeout)
//                .setSocketTimeout(timeout)
                .build();
        CloseableHttpClient client = HttpClientBuilder
                .create()
                .setDefaultRequestConfig(config)
                .build();
        return new HttpComponentsClientHttpRequestFactory(client);
    }


    //    @ConditionalOnMissingBean(RestTemplate.class)
//    @Bean
//    public RestTemplate restTemplate() {
//        RestTemplate restTemplate = new RestTemplate(getClientHttpRequestFactory());
//        return restTemplate;
//    }
//
//
//    /**
//     * 使用OkHttpClient作为底层客户端
//     *
//     * @return
//     */
//    private ClientHttpRequestFactory getClientHttpRequestFactory() {
//        OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                .connectTimeout(5, TimeUnit.SECONDS)
//                .writeTimeout(5, TimeUnit.SECONDS)
//                .readTimeout(5, TimeUnit.SECONDS)
//                .build();
//        return new OkHttp3ClientHttpRequestFactory(okHttpClient);
//    }

}
