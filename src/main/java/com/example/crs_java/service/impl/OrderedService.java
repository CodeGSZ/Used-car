package com.example.crs_java.service.impl;

import com.example.crs_java.entity.Order;
import com.example.crs_java.entity.User;
import com.example.crs_java.mapper.OrderedMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderedService {
    @Autowired
    OrderedMapper orderedMapper;

    //完成订单
    public List<Order> selectOrdered () {
        List<Order> listOrdered = orderedMapper.wancheng();
        return listOrdered;
    }
    //失败订单
    public List<Order> selectFailOrder () {
        List<Order> listFail = orderedMapper.fail();
        return listFail;
    }
    //正在生效订单查询
    public List<User> selectOrdering () {
        List<User> listOrdering = orderedMapper.ordering();
        return listOrdering;
    }
}
