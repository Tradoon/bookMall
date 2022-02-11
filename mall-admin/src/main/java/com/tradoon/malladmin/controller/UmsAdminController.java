package com.tradoon.malladmin.controller;

import com.tradoon.bookmall.common.api.CommonResult;
import com.tradoon.malladmin.service.AdminService;
import com.tradoon.mallmbg.model.UmsAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:tradoon
 * desciption:用户注册/登录 相关接口
 * date:
 */
@RestController
@RequestMapping("/admin")
public class UmsAdminController {

    @Autowired
    AdminService adminService;

    public CommonResult<UmsAdmin> register(UmsAdmin user){
        return CommonResult.success(adminService.register(user));
    }
}