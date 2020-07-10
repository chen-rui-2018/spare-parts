package com.xj.work.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author： chenr
 * @date： Created on 2020/7/10 16:38
 * @version： v1.0
 * @modified By:
 */
@ApiModel(value = "Result", description = "返回结果实体")
public class Result<T> implements Serializable {
    /**
     * 全站，默认成功编码是0000
     */
    public final static String SUCCESS_CODE = "0000";
    @ApiModelProperty(value = "返回结果描述",notes = "成功默认为ok",dataType = "String")
    private String result = "OK";
    @ApiModelProperty(value = "返回结果编码",notes = "成功统一编码为0000",dataType = "String")
    private String code = SUCCESS_CODE;
    private T data;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public Result(String result, String code, T data) {
        this.result = result;
        this.code = code;
        this.data = data;
    }
    public Result(String code, String result){
        this.result = result;
        this.code = code;
    }
    public Result(T data) {
        this.data = data;
    }
    public Result(){}


    @Override
    public String toString() {
        return "Result{" +
                "result='" + result + '\'' +
                ", code='" + code + '\'' +
                ", data=" + data +
                '}';
    }
}