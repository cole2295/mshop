package com.mshop.coreservice.product;

import com.mshop.common.spring.BaseConfiguration;
import com.mshop.common.spring.ServiceClientConfig;
import com.mshop.common.spring.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Import;

/**
 * Created by zhm on 16-11-17.
 */
@SpringBootApplication
@Import({ServiceClientConfig.class,BaseConfiguration.class,SwaggerConfig.class})
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class,args);
    }
}
