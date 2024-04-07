package com.example.crs_java.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("user")
public class User {
    //user表中的字段信息
    private int id;
    private String name;
    private String password;
    private String tel;
    private String birthday;
    private String address;
    @TableField(value = "orderNum")
    private int orderNum;
    @TableField(value = "createTime")
    private Date createTime;
    @TableField(value = "CarTypeId")
    private int CarTypeId;
    private int Identy;
    private String sex;
}
