package com.mshop.common.spring;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mshop.spring.CustomRestTemplate;
import com.mshop.utils.JsonUtils;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhm on 16-11-24.
 */
@EnableHystrix
public class BaseConfiguration {

    //customize object mapper
    @Bean
    @Primary
    public ObjectMapper objectMapper() {
        return JsonUtils.OBJECT_MAPPER;
    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter) {

        return CustomRestTemplate.assembleRestTemplate(mappingJackson2HttpMessageConverter);
    }

    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        return new MappingJackson2HttpMessageConverter(objectMapper());
    }


}