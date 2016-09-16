package com.baidu.www.service;

import com.baidu.www.po.UserEntity;

import java.util.List;

/**
 * 用户表相关的接口
 * Created by Administrator on 2016/9/16.
 */
public interface UserService {
    /**
     * 获取所有用户的信息
     *
     * @return
     */
    List<UserEntity> getAllUsers();
}
