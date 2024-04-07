package com.example.crs_java.mapper;

import com.example.crs_java.entity.Order;
import com.example.crs_java.entity.User;

import java.util.List;

public interface OrderedMapper {
    //完成订单
    List<Order> wancheng ();
    //失败订单
    List<Order> fail ();
    //正在生效订单
    List<User> ordering();
}
