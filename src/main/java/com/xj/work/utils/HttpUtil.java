package com.xj.work.utils;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sugar
 * @Date 2019/5/10
 */
public class HttpUtil {

    private static final Logger logger = LoggerFactory.getLogger(HttpUtil.class);

    public <T> T postForObject(String postpositionUrl, Object bean, Map<String,Object> queryParam, Class<T> resultClazz) throws JsonProcessingException {
        String url = PropertyUtil.TARGET_URL + postpositionUrl;
        if (queryParam != null && queryParam.size() !=  0){
            url = parameterToRequestParam(url,queryParam);
        }
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));
        HttpEntity formEntity;
        formEntity = getHttpEntity(bean);
        T result = restTemplate.postForObject(url, formEntity, resultClazz);
        return result;
    }

    public <T> T postForObject(String postpositionUrl, Object bean, Class<T> resultClazz) throws JsonProcessingException {
        return postForObject(postpositionUrl,bean,null, resultClazz);
    }

    public static <T> HttpEntity getHttpEntity(T bean) throws JsonProcessingException {
        //生成请求头
        HttpHeaders headers;
        try {
            headers = addGeneralHead();
        } catch (Exception e) {
            logger.warn("generate header error.", e);
            throw new RuntimeException("generate header error.", e);
        }
        //构建请求内容
        ObjectMapper mapper = new ObjectMapper();
        if (bean instanceof  String) {
            String jsonValue = (String) bean;
            return new HttpEntity<>(jsonValue, headers);
        }else {
            String jsonValue = mapper.writeValueAsString(bean);
            return new HttpEntity<>(jsonValue, headers);
        }

    }

    public <T> T postForQueryParam(String postpositionUrl, Map<String,Object> queryParam, Class<T> resultClazz) throws JsonProcessingException {
        String url = PropertyUtil.TARGET_URL + postpositionUrl;
        url = parameterToRequestParam(url,queryParam);
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));
        HttpHeaders headers = addGeneralHead();
        HttpEntity formEntity = new HttpEntity<>(headers);
        T result = restTemplate.postForObject(url, formEntity, resultClazz);
        return result;
    }

    public <T> T postForQueryObj(String postpositionUrl,String beanName, Object bean, Class<T> resultClazz) throws JsonProcessingException {
        Map <String,Object> param = new HashMap<>();
        param.put(beanName, JSON.toJSONString(bean));
        String url = parameterToRequestParam(postpositionUrl,param);

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));
        HttpHeaders headers = addGeneralHead();
        HttpEntity formEntity = new HttpEntity<>(headers);
        T result = restTemplate.postForObject(url, formEntity, resultClazz);
        return result;
    }

    /**
     * @description: 设置一般请求的头信息
     * @data: 2020/6/12 09:28
     */
    public static HttpHeaders addGeneralHead() throws JsonProcessingException {

        String authorization = RequestTokenUtil.accessToken();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType(MediaType.APPLICATION_JSON_UTF8_VALUE));
        headers.add("Authorization", authorization);
        headers.add("x-system-code", PropertyUtil.CLIENT_ID);
        headers.add("x-application-code", PropertyUtil.CLIENT_APPLICATION_CODE);
        return headers;
    }

    /**
     * @description: 设置url中的参数进行拼接
     * @data: 2020/6/12 09:00
     */
    public static String parameterToRequestParam(String url,Map<String,Object> param){
        if(url == null) {return null;}

        if (param == null || param.size() ==0) {return url;}

        String and = "&";
        String question = "?";

        StringBuffer urlBuffer = new StringBuffer(url);
        String result;

        if (!url.contains(question)){
            urlBuffer.append(question);
        }else if (!url.endsWith(question) && !url.endsWith(and)){
            urlBuffer.append(and);
        }

        for (String s : param.keySet()) {
            urlBuffer
                    .append(s)
                    .append("=")
                    .append(param.get(s))
                    .append(and);
        }

        return urlBuffer.toString();
    }

//    public static void main(String[] args) {
//
//        DemoQuery demoQuery = new DemoQuery();
//        demoQuery.setAge("10");
//        demoQuery.setName("abc");
//        Map <String,Object> param = new HashMap<>();
//        param.put("param", JSON.toJSONString(demoQuery));
//        String result = parameterToRequestParam("www.baidu.com",param);
//    }
}
