package com.baidu.www.service.impl;

import com.baidu.www.mapper.UserEntityMapper;
import com.baidu.www.po.UserEntity;
import com.baidu.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户表相关的servie接口实现类
 * Created by Administrator on 2016/9/16.
 */
@Service
public class UserServiceIml implements UserService {
    @Autowired
    private UserEntityMapper userEntityMapper;

    public List<UserEntity> getAllUsers() {
        return userEntityMapper.getAllUsers();
    }
}
