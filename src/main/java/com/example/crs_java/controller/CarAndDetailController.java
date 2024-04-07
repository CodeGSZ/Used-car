package com.example.crs_java.controller;

import com.example.crs_java.entity.Car;
import com.example.crs_java.service.impl.CarAndDetailService;
import com.example.crs_java.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.crs_java.controller.BeasController.OK;

@RestController
@RequestMapping("/user")
public class CarAndDetailController {
    @Autowired
    private CarAndDetailService carAndDetailService;

    @RequestMapping("/cardetail")
    public JsonResult<Car> cardetail (int id) {
        Car data = carAndDetailService.cardetail(id);
        System.out.println(data);
        return new JsonResult<>(OK,data);
    }

}
