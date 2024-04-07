package com.example.crs_java.controller;

import com.example.crs_java.entity.User;
import com.example.crs_java.service.impl.UserServiceLogin;
import com.example.crs_java.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserLoginController extends BeasController {
    @Autowired
    private UserServiceLogin userServiceLogin;
    //登录接口
    @RequestMapping("/login")
    public JsonResult<User> login (String name, String password) {
        User data = userServiceLogin.UserLogin(name, password);
        return new JsonResult<User>(OK, data);
    }
    //更改用户地址接口
    @RequestMapping("/updateNP")
    public Integer updateInfo (int id, String name, String password) {
        Integer rows = userServiceLogin.updataInf(id,name,password);
        return rows;
    }
    //更改用户地址接口
    @RequestMapping("/updateAddress")
    public Integer updateAdd (int id, String address) {
        Integer rows = userServiceLogin.updateAddSer(id, address);
        return rows;
    }
    //添加购物车接口
    @RequestMapping("/addshoping")
    public Integer updateShopping (int id, int num) {
        Integer rows = userServiceLogin.AddShop(id, num);
        return rows;
    }
}
