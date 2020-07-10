package com.xj.config;

import java.io.Serializable;

/**
 * @author LiJiaJun
 * @description
 * @data 2020/04/17
 */
public enum ResultCodeEnum implements Serializable {
    SUCCESS(200,"Success.",true,""),

    /**
     * 权限异常
     * 未知异常 300
     */
    AUTH_EXCEPTION(301,"Login timeout,please login again",false,""),
    LOGIN_TIME_OUT(301,"Login timeout,please login again",false,""),

    /**
     * 请求异常
     * 未知异常 400
     */
    PARAMETER_EXCEPTION(400,"The parameter does not conform to the rule",false,""),
    NOT_FOUND(404,"not found",false,""),

    /**
     * 服务端异常
     * 未知异常 500
     * 内部代理丢失 503转发至中台出现错误
     */
    SERVER_ERROR(500,"server error",false,""),
    SERVER_MAINTENANCE(503,"Unable to parse middle platform response.",false,"");


    private Integer status;
    private boolean successful;
    private String defaultMsg;
    private String errorPage;

    public Integer getStatus() {
        return this.status;
    }
    public String getDefaultMsg() {
        return this.defaultMsg;
    }
    public boolean getSuccessful() {
        return this.successful;
    }
    public String getErrorPage() {
        return this.errorPage;
    }

    ResultCodeEnum(Integer status, String defaultMsg, boolean successful, String errorPage) {
        this.status = status;
        this.defaultMsg = defaultMsg;
        this.successful = successful;
    }
}
