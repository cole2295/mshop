package com.mshop.coreservice.product.errorcode;

import com.mshop.errorcode.ErrorCode;

/**
 * Created by zhm on 16-11-21.
 */
public enum BrandInfoErrorCode implements ErrorCode {
    BrandInfoErrorCode(12100,"存储品牌消息出错");

    private int status;
    private String message;
    BrandInfoErrorCode(int status, String message) {
        this.status = status;
        this.message = message;
    }
    @Override
    public String getCode() {
        return this.name();
    }

    @Override
    public int getStatus() {
        return this.status;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
