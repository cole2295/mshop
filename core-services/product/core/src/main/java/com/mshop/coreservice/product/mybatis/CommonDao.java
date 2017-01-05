package com.mshop.coreservice.product.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by zhm on 16-11-21.
 */
@Mapper
@Service("commonDao")
public interface CommonDao {
    String selectAll = "select t5.*,t6.name,t6.location from" +
            "(" +
                "select t3.*,t4.cn_name,t4.en_name,t4.logo from" +
                    "(" +
                    "   select t1.*,t2.pro_type_id,t2.brand_id,t2.b_userid,t2.title as p_title,t2.rang_price" +
                    "   from product_sku_info t1 left join product_info t2 on t1.product_id=t2.id" +
                    ") t3 " +
                "left join brand_info t4 on t3.brand_id=t4.id) t5 " +
            "left join product_type t6 on t5.pro_type_id=t6.id";

    @Select(selectAll)
    List<Map> findAllProductsNested();
}
