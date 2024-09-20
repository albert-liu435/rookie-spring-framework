package com.rookie.bigdata.springframework.web.client;

import com.rookie.bigdata.springframework.context.annotation.componentscan.ScanComponentConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class RestTemplateConfigTest
 * @Description
 * @Author rookie
 * @Date 2024/9/20 10:43
 * @Version 1.0
 */
@Slf4j
class RestTemplateConfigTest {

    @Test
    void test01() {
        //加载配置类
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(RestTemplateConfig.class);

        //获取成功注册到容器中的所有Bean的名称
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();

        //遍历Bean的名称
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }


        RestTemplate restTemplate = (RestTemplate) annotationConfigApplicationContext.getBean("restTemplate");

        String result = restTemplate.getForObject("https://www.baidu.com", String.class);
//        System.out.println(result);
        log.info(result);


    }

    @Test
    void test02() {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://127.0.0.1:8090/greeting", String.class);
        log.info(result);
    }


    @Test
    void test03() {
        ClientHttpRequestInterceptor i1 = new ClientHttpRequestInterceptor() {
            @Override
            public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
                System.out.println("拦截器1开始。。。");
                ClientHttpResponse execute = execution.execute(request, body);
                System.out.println("拦截器1结束。。。");
                return execute;
            }
        };
        ClientHttpRequestInterceptor i2 = new ClientHttpRequestInterceptor() {
            @Override
            public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
                System.out.println("拦截器2开始。。。");
                ClientHttpResponse execute = execution.execute(request, body);
                System.out.println("拦截器2结束。。。");
                return execute;
            }
        };
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getInterceptors().add(i1);
        restTemplate.getInterceptors().add(i2);
//        String result = restTemplate.getForObject("http://127.0.0.1:8090/greeting", String.class);
        String result = restTemplate.getForObject("https://www.baidu.com", String.class);
        log.info(result);
    }

    @Test
    void test04(){
        String[] loabancerhost = {"https://www.baidu.com", "https://www.sina.com.cn"};
        AtomicInteger times = new AtomicInteger(0);
        ClientHttpRequestInterceptor i1 = new ClientHttpRequestInterceptor() {
            @Override
            public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
                int length = loabancerhost.length;
                int i = times.getAndIncrement() % length;
                //因为 HttpRequest 和 URI 不提供修改功能，因此需要借助 HttpRequestWrapper 对request进行包装
                Mywraper mywraper = new Mywraper(request, loabancerhost[i]);
                ClientHttpResponse execute = execution.execute(mywraper, body);
                return execute;
            }
        };
        ClientHttpRequestInterceptor i2 = new ClientHttpRequestInterceptor() {
            @Override
            public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
                System.out.println("第"+times+"次请求的host为: "+request.getURI());
                ClientHttpResponse execute = execution.execute(request, body);
                return execute;
            }
        };
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getInterceptors().add(i1);
        restTemplate.getInterceptors().add(i2);
        for (int i = 10; i > 0; i--) {
            restTemplate.getForObject("http://www.baidu.com", String.class);
        }
    }

}
