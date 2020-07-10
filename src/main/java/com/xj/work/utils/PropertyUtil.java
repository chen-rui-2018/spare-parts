package com.xj.work.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PropertyUtil {

    @Value("${target.base-url}")
    private String targetUrl;
    public static String TARGET_URL;

    @Value("${client_id}")
    private String clientId;
    public static String CLIENT_ID;

    @Value("${client_secret}")
    private String clientSecret;
    public static String CLIENT_SECRET;

    @Value("${client_application_code}")
    private String clientApplicationCode;
    public static String CLIENT_APPLICATION_CODE;

    @Value("${client_token_url}")
    private String clientTokenUrl;
    public static String CLIENT_TOKEN_URL;

    @Value("${charset}")
    private String charset;
    public static String CHARSET;

    @Value("${grant_type}")
    private String grantType;
    public static String GRANT_TYPE;

    @Value("${content_type}")
    private String contentType;
    public static String CONTENT_TYPE;


    @PostConstruct
    public void transValues() {
        TARGET_URL = this.targetUrl;
        CLIENT_ID = clientId;
        CHARSET = charset;
        CLIENT_SECRET = clientSecret;
        CLIENT_APPLICATION_CODE = clientApplicationCode;
        CLIENT_TOKEN_URL = clientTokenUrl;
        GRANT_TYPE = grantType;
        CONTENT_TYPE = contentType;
    }

    public static String getUrl(String targetUrl){
        return TARGET_URL + targetUrl;
    }
}
