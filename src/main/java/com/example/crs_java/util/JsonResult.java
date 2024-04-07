package com.example.crs_java.util;

import java.io.Serializable;

/*
    封装返回数据工具
    采用JSON的格式像前端返回数据
 */
public class JsonResult<E> implements Serializable {
    private Integer state;          //状态码
    private String message;         //描述信息
    private E data;                 //数据

    //无参构造方法
    public JsonResult() {
    }
    //设置状态码
    public JsonResult(Integer state) {
        this.state = state;
    }
    //捕获异常
    public JsonResult(Throwable e) {
        this.message = e.getMessage();
    }

    //设置状态码和数据
    public JsonResult(Integer state, E data) {
        this.state = state;
        this.data = data;
    }
    //生成对应的get\set方法

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
