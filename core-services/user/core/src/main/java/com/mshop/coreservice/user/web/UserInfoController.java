package com.mshop.coreservice.user.web;

import com.mshop.coreservice.user.domain.UserInfo;
import com.mshop.coreservice.user.errorcode.UserErrorCode;
import com.mshop.coreservice.user.exception.UserException;
import com.mshop.coreservice.user.reponsitory.UserInfoReponsitory;
import com.mshop.response.MshopResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhm on 16-11-17.
 */
@RestController
@Api(description = "用户信息操作相关API")
public class UserInfoController extends BaseController{
    @Autowired
    private UserInfoReponsitory userInfoReponsitory;

    @ApiOperation(value = "获取用户详情", notes = "根据用户ID获取用户详情信息，通过URL传参。")
    @ApiImplicitParam(name = "userid", value = "用户ID", required = true, dataType = "long", paramType = "query")
    @RequestMapping(value = "/findUserById",method = RequestMethod.GET)
    public MshopResponse findUserById(@RequestParam(value = "userid",defaultValue = "0")long userid){
        System.out.println("执行了。。。。。。。。。。。。。。。");
        if(userid==0){
            throw new UserException(UserErrorCode.USERID_IS_EMPTY,"用户ID不能为空！");
        }else{
            return super.generateSuccessResponse(userInfoReponsitory.findById(userid));
        }
    }
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public MshopResponse addUser(UserInfo userInfo){
        userInfoReponsitory.save(userInfo);
        return super.generateSuccessResponse("");
    }

}
