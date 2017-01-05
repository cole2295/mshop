package com.mshop.coreservice.user.reponsitory;

import com.mshop.coreservice.user.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhm on 16-11-17.
 */
public interface UserInfoReponsitory extends JpaRepository<UserInfo,Long> {

    UserInfo findById(long id);
}
