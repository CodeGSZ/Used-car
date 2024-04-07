package com.example.crs_java.service.impl;

import com.example.crs_java.entity.User;
import com.example.crs_java.mapper.UserLoginMapper;
import com.example.crs_java.service.IUserService;
import com.example.crs_java.service.ex.PasswordNotMatchException;
import com.example.crs_java.service.ex.UserNotFoundException;
import com.example.crs_java.service.ex.UsernameDuplicatedException;
import com.mysql.cj.exceptions.PasswordExpiredException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceLogin {
    @Autowired
    UserLoginMapper userLoginMapper;

    //登录检验
    public User UserLogin (String username, String userpassoword) {
        //根据用户名来进行查找，判断用户是否进行注册
        User user = userLoginMapper.Login(username,userpassoword);
        System.out.println("登录用户名："+username);
        System.out.println("登录密码："+userpassoword);
        if (user == null) {
            //没有注册，抛出异常
            throw new UserNotFoundException("用户数据不存在！");
        }
//        检验密码是否匹配
        String SelPwd = user.getPassword();       //根据用户名称从数据库中获取的密码
        if (!SelPwd.equals(userpassoword)) {
            throw new PasswordNotMatchException("密码错误！！");
        }
        return user;
    }

    //修改用户账号、密码信息
    public Integer updataInf (int id, String name, String password) {
        Integer rows = userLoginMapper.UpdataNP(id,name,password);
        return rows;
    }
    //修改用户密码
    public Integer updateAddSer (int id, String address) {
        Integer rows = userLoginMapper.UpdateAddress(id,address);
        return rows;
    }
    //添加购物车
    public Integer AddShop (int id, int num) {
        Integer shoping = userLoginMapper.addShoping(id, num);
        return shoping;
    }
}
