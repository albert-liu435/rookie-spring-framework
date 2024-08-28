package com.rookie.bigdata.springframework.scheduling.annotation.asyncs.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * @Class HelloService
 * @Description
 * @Author rookie
 * @Date 2024/8/28 11:22
 * @Version 1.0
 */
@Component
@Slf4j
public class HelloService {


    @Async(value = "myTaskExecutor")
    public void print() {
        log.info(Thread.currentThread().getName() + ":" + " test Async call.");
    }


    @Async(value = "myTaskExecutor")
    public Future<String> print2(){
        log.info(Thread.currentThread().getName() + ":" + " test Async call.");

        return new AsyncResult<>("HelloService finished");
    }

    @Async(value = "myTaskExecutor")
    public CompletableFuture<String> print3(){
        log.info(Thread.currentThread().getName() + ":" + " test Async call.");

        CompletableFuture<String> stringCompletableFuture = new CompletableFuture<>();
        return stringCompletableFuture;
    }

    //CompletableFuture
//    spring-context

//    Deprecation of ListenableFuture and related types (ListenableFutureCallback, SettableListenableFuture, etc.)
//Deprecation of AsyncListenableTaskExecutor in favor of default methods in AsyncTaskExecutor (submitCompletable).
//AsyncHandlerMethodReturnValueHandler now has toCompletableFuture instead of toListenableFuture.
//WebSocketClient now has execute methods, which do the same as doHandshake, but return CompletableFutures (cf. the reactive WebSocketClient).

}
