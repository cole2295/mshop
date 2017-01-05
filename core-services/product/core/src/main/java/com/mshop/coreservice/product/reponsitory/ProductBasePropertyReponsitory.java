package com.mshop.coreservice.product.reponsitory;

import com.mshop.coreservice.product.domain.ProductBaseProperty;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhm on 16-11-21.
 */
public interface ProductBasePropertyReponsitory extends JpaRepository<ProductBaseProperty,Long> {
}
