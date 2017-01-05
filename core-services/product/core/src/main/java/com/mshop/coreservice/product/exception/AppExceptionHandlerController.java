package com.mshop.coreservice.product.exception;

import com.mshop.errorcode.CommonErrorCode;
import com.mshop.errorcode.ErrorCode;
import com.mshop.exceptions.CommonException;
import com.mshop.response.MshopResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhm on 16-11-17.
 * 统一异常处理
 */
@ControllerAdvice
public class AppExceptionHandlerController extends ResponseEntityExceptionHandler {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(value = {CommonException.class})
    public ResponseEntity<MshopResponse> handleRemoteCallException(HttpServletRequest request, CommonException e) {
        logger.error(e.getMessage(), e);
        return createResponseEntity(e.getCode(), e.getStatus(), request.getRequestURI(), e.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<MshopResponse> handleException(HttpServletRequest request, Exception e) {
        logger.error("服务器发生错误: " + e.getMessage(), e);
        ErrorCode errorCode = CommonErrorCode.DEFAULT_ERROR;
        return createResponseEntity(errorCode, request.getRequestURI(), errorCode.getMessage());
    }

    private ResponseEntity<MshopResponse> createResponseEntity(ErrorCode errorCode, String requestUri, String message) {
        return createResponseEntity(errorCode.getCode(), errorCode.getStatus(), requestUri, message);
    }

    private ResponseEntity<MshopResponse> createResponseEntity(String code, int status, String requestUri, String message) {
        MshopResponse error = new MshopResponse(code, requestUri, message, status);
        return ResponseEntity.status(HttpStatus.OK).
                header("Content-Type","application/json; charset=UTF-8").
                body(error);
    }

}