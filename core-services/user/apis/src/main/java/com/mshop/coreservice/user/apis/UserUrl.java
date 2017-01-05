package com.mshop.coreservice.user.apis;

/**
 * Created by zhm on 16-11-22.
 */
public interface UserUrl {
    String SERVICE_NAME = "MSHOP-USER";

    String SERVICE_HOSTNAME = "http://MSHOP-USER";

    String FIND_USER_BYID = "/findUserById";

    static String buildUrl(String url) {
        return SERVICE_HOSTNAME + url;
    }
}
