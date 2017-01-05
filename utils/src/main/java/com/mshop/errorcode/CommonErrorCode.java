package com.mshop.errorcode;

/**
 * Created by zhm on 16-11-17.
 */
public enum CommonErrorCode implements ErrorCode {

    DEFAULT_ERROR(17000,"服务器内部出错"),
    SERVICE_UNAVAILABLE(17503, "服务不可用");

    private int status;
    private String message;
    CommonErrorCode(int status, String message) {
        this.status = status;
        this.message = message;
    }
    @Override
    public String getCode() {
        return this.name();
    }

    @Override
    public int getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
