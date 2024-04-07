package com.example.crs_java.service.impl;

import com.example.crs_java.entity.User;
import com.example.crs_java.mapper.UserAddMapper;
import com.example.crs_java.service.IUserService;
import com.example.crs_java.service.ex.InsertException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//用户注册模块的业务层实现
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserAddMapper userAddMapper;
    @Override
    public void reg(User user) {
        //补全表单默认字段
        user.setOrderNum(0);
        user.setCarTypeId(0);
        user.setIdenty(1);
        //添加用户(当rows的值==1是则插入成功)
        Integer rows = userAddMapper.AddUser(user);
        if (rows != 1) {
            //获取异常信息
            throw new InsertException("插入异常，请联系管理员！！！！");
        }
    }
}
