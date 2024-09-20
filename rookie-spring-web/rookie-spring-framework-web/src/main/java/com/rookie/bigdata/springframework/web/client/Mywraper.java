package com.rookie.bigdata.springframework.web.client;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.support.HttpRequestWrapper;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * @Class Mywraper
 * @Description
 * @Author rookie
 * @Date 2024/9/20 11:44
 * @Version 1.0
 */
public class Mywraper extends HttpRequestWrapper {
    private String url;

    public Mywraper(HttpRequest request, String url) {
        super(request);
        this.url = url;
    }
    @Override
    public URI getURI() {
        try {
            return new URI(url);
        } catch (URISyntaxException e) {
        }
        return null;
    }
}
