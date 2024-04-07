package com.example.crs_java.controller;

import com.example.crs_java.entity.Order;
import com.example.crs_java.entity.User;
import com.example.crs_java.service.impl.OrderedService;
import com.example.crs_java.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/admin")
public class OrderedController extends BeasController {
    @Autowired
    private OrderedService orderedService;
    //完成订单接口
    @RequestMapping("/ordered")
    public List<Order> selectOrdered () {
        List<Order> data = orderedService.selectOrdered();
        System.out.println(data);
        return data;
    }
    //失败订单接口
    @RequestMapping("/fail")
    public List<Order> selectFail () {
        List<Order> FailData = orderedService.selectFailOrder();
        System.out.println(FailData);
        return FailData;
    }
    //正在生效订单查询
    @RequestMapping("/ordering")
    public List<User> selectOrdering() {
        List<User> orderingList = orderedService.selectOrdering();
        return orderingList;
    }
}
