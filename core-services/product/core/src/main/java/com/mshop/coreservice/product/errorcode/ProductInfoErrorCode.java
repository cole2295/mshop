package com.mshop.coreservice.product.errorcode;

import com.mshop.errorcode.ErrorCode;

/**
 * Created by zhm on 16-11-21.
 */
public enum ProductInfoErrorCode implements ErrorCode {
    ProductInfoErrorCode(12100,"存储产品消息出错");
    private int status;
    private String message;
    ProductInfoErrorCode(int status, String message) {
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
