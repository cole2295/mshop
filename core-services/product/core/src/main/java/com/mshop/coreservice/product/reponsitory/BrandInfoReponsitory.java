package com.mshop.coreservice.product.reponsitory;

import com.mshop.coreservice.product.domain.BrandInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhm on 16-11-21.
 */
public interface BrandInfoReponsitory extends JpaRepository<BrandInfo,Long> {
}
