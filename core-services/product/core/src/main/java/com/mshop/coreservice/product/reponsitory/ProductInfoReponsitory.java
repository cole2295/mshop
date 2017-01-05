package com.mshop.coreservice.product.reponsitory;

import com.mshop.coreservice.product.domain.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhm on 16-11-21.
 */
public interface ProductInfoReponsitory extends JpaRepository<ProductInfo,Long> {
}
