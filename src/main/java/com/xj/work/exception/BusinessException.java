package com.xj.work.exception;

import com.xj.config.ResultCodeEnum;

public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 5774039636574319620L;
    protected ResultCodeEnum status;

    public BusinessException(String message) {
        throw new BusinessException(ResultCodeEnum.SERVER_ERROR, message);
    }

    public BusinessException(ResultCodeEnum status, String message) {
        super(message);
        this.status = status;
    }

    public ResultCodeEnum getStatus() {
        return this.status;
    }
}
