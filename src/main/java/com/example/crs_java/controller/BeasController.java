package com.example.crs_java.controller;

import com.example.crs_java.service.ex.*;
import com.example.crs_java.util.JsonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class BeasController {
    public static final int OK = 200;
    //请求处理方法，这个方法的返回值就是传递给前端的数据
    @ExceptionHandler(ServiceException.class)
    public JsonResult<Void> handleException (Throwable e) {
        JsonResult<Void> result = new JsonResult<>(e);
        if (e instanceof UsernameDuplicatedException) {
            result.setState(4000);
            result.setMessage("用户名已存在！");
        } else if (e instanceof UserNotFoundException) {
            result.setState(5001);
            result.setMessage("用户数据不存在异常");
        } else if (e instanceof PasswordNotMatchException) {
            result.setState(5002);
            result.setMessage("用户密码错误异常");
        } else if (e instanceof InsertException) {
            result.setState(5000);
            result.setMessage("注册失败，未知异常请联系管理员！");
        } else {
            result.setMessage("注册成功！");
        }
        return result;
    }
}
