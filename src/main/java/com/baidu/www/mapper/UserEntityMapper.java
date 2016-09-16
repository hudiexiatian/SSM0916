package com.baidu.www.mapper;

import com.baidu.www.po.UserEntity;

import java.util.List;

/**
 * 用户表实体maper接口类
 * Created by Administrator on 2016/9/16.
 */
public interface UserEntityMapper {

    /**
     * 查找所有用户信息
     * @return
     */
    List<UserEntity> getAllUsers();

}
