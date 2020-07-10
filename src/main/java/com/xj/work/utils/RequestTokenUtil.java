package com.xj.work.utils;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.xj.work.exception.BusinessException;
import com.xj.config.ResultCodeEnum;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/**
 * @author LiJiaJun
 * @description
 * @data 2020/06/12
 */
public class RequestTokenUtil {

    /**
     * @description: 获取中台令牌
     * @data: 2020/6/12 08:45
     */
    public static String accessToken() throws JsonProcessingException {
        String url = PropertyUtil.TARGET_URL + PropertyUtil.CLIENT_TOKEN_URL;

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));

        HttpEntity formEntity = getAccessTokenEntity();

        String result = restTemplate.postForObject(url, formEntity, String.class);
        if (result == null){
            throw new BusinessException(ResultCodeEnum.SERVER_MAINTENANCE, "去中台拿token时无法获取返回结果");
        }
        Map<String, Object> mapTypes = JSON.parseObject(result);
        Object tokenObj = mapTypes.get("access_token");
        if (tokenObj == null){
            throw new BusinessException(ResultCodeEnum.SERVER_MAINTENANCE, "去中台拿token时无法解析返回结果");
        }
        return "Bearer " + tokenObj;
    }

    /**
     * @description: 获取令牌接口的请求体内容获取
     * @data: 2020/6/12 09:46
     */
    public static HttpEntity<MultiValueMap<String, Object>> getAccessTokenEntity() throws JsonProcessingException {
        //生成请求头
        HttpHeaders headers = addAccessTokenHead();

        //生成请求体
        MultiValueMap<String, Object> postParameters =  getAccessTokenBody();

        return new HttpEntity<MultiValueMap<String, Object>>(postParameters, headers);
    }


    /**
     * @description: 设置获取令牌接口的请求头内容
     * @data: 2020/6/12 09:28
     */
    private static HttpHeaders addAccessTokenHead(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", getAuthorization());
        headers.add("Content-Type", PropertyUtil.CONTENT_TYPE);
        return headers;
    }

    /**
     * @description: 获取令牌接口的请求体获取
     * @da 2020/6/12 09:46
     */
    private static MultiValueMap<String, Object> getAccessTokenBody(){
        MultiValueMap<String, Object> postParameters = new LinkedMultiValueMap<>();
        postParameters.add("client_id",PropertyUtil.CLIENT_ID);
        postParameters.add("client_secret",PropertyUtil.CLIENT_SECRET);
        postParameters.add("grant_type",PropertyUtil.GRANT_TYPE);
        return postParameters;
    }

    /**
     * @description: 拿到获取token接口的head参数Authorization
     * @data: 2020/6/12 09:28
     */
    public static String getAuthorization(){

        String auth = PropertyUtil.CLIENT_ID + ":"+PropertyUtil.CLIENT_SECRET;
        byte[] encodedAuth = org.apache.commons.codec.binary.Base64.encodeBase64(auth.getBytes(Charset.forName(PropertyUtil.CHARSET)));

        return "Basic " + new String(encodedAuth);
    }

}
