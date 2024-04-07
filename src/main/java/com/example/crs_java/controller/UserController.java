package com.example.crs_java.controller;

import com.example.crs_java.entity.User;
import com.example.crs_java.service.IUserService;
import com.example.crs_java.service.ex.InsertException;
import com.example.crs_java.service.ex.UsernameDuplicatedException;
import com.example.crs_java.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends BeasController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping("/add")
    public JsonResult<Void> AddUser (User user) {
        iUserService.reg(user);
        return new JsonResult<>(OK);
    }



    /*
    @RequestMapping("/add")
    public JsonResult<Void> AddUser (User user) {
        //创建响应结果对象
        JsonResult<Void> result = new JsonResult<>();
        try {
            iUserService.reg(user);
            result.setState(200);
            result.setMessage("注册成功！");
        } catch (UsernameDuplicatedException e) {
            result.setState(4000);
            result.setMessage("用户名被占用！！！");
        } catch (InsertException e) {
            result.setState(5000);
            result.setMessage("注册失败，产生未知的错误请联系管理员！");
        }
        return result;
    }
     */
}
