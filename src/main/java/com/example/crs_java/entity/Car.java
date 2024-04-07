package com.example.crs_java.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("Car")
public class Car {
    private int id;
    @TableField(value = "UserID")
    private int UserId;
    @TableField(value = "adminId")
    private int adminId;
//    @TableField(value = "CarDetailId")
//    private int CarDetailId;
    //Car表关联CarDetail表
    private CarDetail carDetail;

    @TableField(value = "CarName")
    private String CarName;
    @TableField(value = "CarInformation")
    private String CarInformation;
    @TableField(value = "Num")
    private int Num;
    @TableField(value = "color")
    private String color;
    @TableField(value = "price")
    private String price;

}
