package com.mshop.coreservice.product.web;

import com.mshop.coreservice.product.domain.ProductInfo;
import com.mshop.coreservice.product.gateway.UserGateway;
import com.mshop.coreservice.product.mybatis.CommonDao;
import com.mshop.coreservice.product.reponsitory.ProductInfoReponsitory;
import com.mshop.exceptions.ServiceUnavailableException;
import com.mshop.response.MshopResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by zhm on 16-11-21.
 */
@RestController
public class ProductController {
    @Autowired
    private ProductInfoReponsitory productInfoReponsitory;
    @Autowired
    private CommonDao commonDao;
    @Autowired
    private UserGateway userGateway;
    @RequestMapping("/findAllProducts")
    public List<ProductInfo> findAllProducts(){
        return productInfoReponsitory.findAll();
    }
    @RequestMapping("/findAllProductsNested")
    public List<Map> findAllProductsNested(){
        List<Map> results = commonDao.findAllProductsNested();
        results.stream().forEach(data->{
            Long userid = (Long)data.get("b_userid");
            try {
                MshopResponse user = userGateway.findUserById(userid);
                data.put("userinfo",((Map)user.getMessage()).get("username"));
                data.remove("b_userid");
            } catch (Exception e) {
                e.printStackTrace();
                throw new ServiceUnavailableException(e.getMessage());
            }

        });
        return results;
    }
}
