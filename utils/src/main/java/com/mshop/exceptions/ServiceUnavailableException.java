package com.mshop.exceptions;

import com.mshop.errorcode.CommonErrorCode;
import com.mshop.errorcode.ErrorCode;

/**
 * Created by zhm on 16-11-24.
 */
public class ServiceUnavailableException extends CommonException {
    private static final ErrorCode ERROR_CODE = CommonErrorCode.SERVICE_UNAVAILABLE;

    public ServiceUnavailableException(String message) {
        super(ERROR_CODE.getCode(), ERROR_CODE.getStatus(), " 远程服务不可用: " + message);
    }
}
