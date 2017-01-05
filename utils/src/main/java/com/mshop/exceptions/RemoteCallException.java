package com.mshop.exceptions;
import com.mshop.errorcode.Error;

/**
 * Created by zhm on 16-11-24.
 */
public class RemoteCallException extends CommonException{
    public RemoteCallException(Error error, int status) {
        super(error.getCode(),status,"调用远程服务异常, cause: " + error.getMessage());
    }
}
