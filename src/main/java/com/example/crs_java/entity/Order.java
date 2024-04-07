package com.example.crs_java.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("ordered")
public class Order {
    private int id;
    private String username;
    private int ordernum;
    private String price;
    private Date ordered;
    @TableField("createTime")
    private Date createTime;
    private int state;
    @TableField("fairDetail")
    private String fairDetail;
}
