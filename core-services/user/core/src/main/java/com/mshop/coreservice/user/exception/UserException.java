package com.mshop.coreservice.user.exception;

import com.mshop.errorcode.ErrorCode;
import com.mshop.exceptions.CommonException;

/**
 * Created by zhm on 16-11-17.
 */
public class UserException extends CommonException {
    public UserException(ErrorCode errorCode,String message) {
        super(errorCode,message);
    }
}
