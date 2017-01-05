package com.mshop.coreservice.user.web;


import com.mshop.response.MshopResponse;

/**
 * Created by zhm on 16-9-19.
 */
public class BaseController {
    public MshopResponse generateSuccessResponse(Object message){
        return new MshopResponse("SUCCESS",message,10000);
    }
}