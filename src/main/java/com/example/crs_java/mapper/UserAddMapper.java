package com.example.crs_java.mapper;

import com.example.crs_java.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserAddMapper {
    //用户注册
    Integer AddUser (User user);

}
