package com.mshop.coreservice.product.gateway;

import com.mshop.coreservice.user.apis.UserUrl;
import com.mshop.exceptions.CommonException;
import com.mshop.response.MshopResponse;
import com.netflix.client.ClientException;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeoutException;

/**
 * Created by zhm on 16-11-22.
 */
@Service("userGateway")
public class UserGateway {
    @Autowired
    private UserClient userClient;

    @HystrixCommand(fallbackMethod = "findDefaultById")
    @HystrixProperty(name = "hystrix.command.default.execution.timeout.enabled", value = "false")
    public MshopResponse findUserById (Long userid) throws CommonException {
        try {
            return userClient.findUserById(userid);
        } catch (Exception e) {
            throw new CommonException(UserUrl.buildUrl(UserUrl.FIND_USER_BYID));
        }
    }
    public MshopResponse findDefaultById (Long userid) throws CommonException {
        throw new CommonException(UserUrl.buildUrl(UserUrl.FIND_USER_BYID));
    }
}
