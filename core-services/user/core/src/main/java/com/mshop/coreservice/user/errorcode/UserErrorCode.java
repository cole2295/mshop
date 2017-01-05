package com.mshop.coreservice.user.errorcode;

import com.mshop.errorcode.ErrorCode;

/**
 * Created by zhm on 16-11-17.
 */
public enum UserErrorCode implements ErrorCode{
    USERID_IS_EMPTY(11001,"用户ID为空！"),
    USER_SAVE_CHECK_ERROR(11002,"保存的用户信息检查出错！");
    private int status;
    private String message;
    UserErrorCode(int status, String message) {
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
