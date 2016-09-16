package com.baidu.www.controller;

import com.baidu.www.po.UserEntity;
import com.baidu.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 用户信息控制类
 * Created by Administrator on 2016/9/16.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    @ResponseBody
    public List<UserEntity> getAllUsers(){
        List<UserEntity> list = userService.getAllUsers();
        return list;
    }

}
