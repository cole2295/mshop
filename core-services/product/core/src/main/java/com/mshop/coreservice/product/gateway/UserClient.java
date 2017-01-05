package com.mshop.coreservice.product.gateway;

import com.mshop.coreservice.user.apis.UserUrl;
import com.mshop.response.MshopResponse;
import com.netflix.client.ClientException;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zhm on 16-11-22.
 */
@FeignClient(UserUrl.SERVICE_HOSTNAME)
public interface UserClient {
    @RequestMapping(method = RequestMethod.GET, value = UserUrl.FIND_USER_BYID)
    MshopResponse findUserById(@RequestParam("userid") Long userid);
}
