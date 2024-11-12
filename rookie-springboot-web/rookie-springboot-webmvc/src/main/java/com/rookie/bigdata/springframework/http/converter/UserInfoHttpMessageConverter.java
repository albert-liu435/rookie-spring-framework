package com.rookie.bigdata.springframework.http.converter;

import com.rookie.bigdata.domain.UserInfo;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

/**
 * @Class UserInfoHttpMessageConverter
 * @Description
 * @Author rookie
 * @Date 2024/11/12 13:59
 * @Version 1.0
 */
public class UserInfoHttpMessageConverter implements HttpMessageConverter<UserInfo> {
    @Override
    public boolean canWrite(Class clazz, MediaType mediaType) {
        return clazz == UserInfo.class;
    }

    @Override
    public boolean canRead(Class<?> clazz, MediaType mediaType) {
        return false;
    }

    /**
     * 该自定义转换器表示可以将UserInfo类型的消息以"application/json"媒体格式写出。
     *
     * @return
     */
    @Override
    public List<MediaType> getSupportedMediaTypes() {
        return Collections.singletonList(MediaType.APPLICATION_JSON);
    }

    @Override
    public UserInfo read(Class<? extends UserInfo> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override
    public void write(UserInfo userInfo, MediaType contentType, HttpOutputMessage outputMessage)
            throws IOException, HttpMessageNotWritableException {
        String result = userInfo.getId() + "_" + userInfo.getName() + "_" + LocalDateTime.now();
        outputMessage.getBody().write(result.getBytes(StandardCharsets.UTF_8));
    }
    //...read Ignore
}
