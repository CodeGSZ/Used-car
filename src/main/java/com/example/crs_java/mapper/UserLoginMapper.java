package com.example.crs_java.mapper;

import com.example.crs_java.entity.User;

public interface UserLoginMapper {
    //登录
    User Login(String name, String password);
    //更改账号、密码
    Integer UpdataNP (int id, String name, String password);
    //添加收获地址
    Integer UpdateAddress (int id, String address);
    //添加购物车
    Integer addShoping (int id, int num);
}

