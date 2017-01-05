package com.mshop.coreservice.product.reponsitory;

import com.mshop.coreservice.product.domain.PropertyInfoValue;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhm on 16-11-21.
 */
public interface PropertyInfoValueReponsitory extends JpaRepository<PropertyInfoValue,Integer> {
}
