package com.mshop.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * Created by zhm on 16-11-17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MshopResponse implements Serializable{
    private static final long serialVersionUID = 8881491097373828774L;
    private String code;

    private Object message;

    private String requestUri;

    private int status;

    public MshopResponse(String code, Object message,  int status) {
        this.code = code;
        this.message = message;
        this.status = status;
    }
    public MshopResponse(String code,String requestUri, Object message,  int status) {
        this.code = code;
        this.message = message;
        this.status = status;
        this.requestUri = requestUri;
    }

    public MshopResponse() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MshopResponse{" +
                "code='" + code + '\'' +
                ", message=" + message +
                ", requestUri='" + requestUri + '\'' +
                ", status=" + status +
                '}';
    }
}
