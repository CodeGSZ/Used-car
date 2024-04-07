package com.example.crs_java.service.impl;

import com.example.crs_java.entity.Car;
import com.example.crs_java.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarAndDetailService {
    @Autowired
    CarMapper carMapper;

    public Car cardetail (int id) {
       Car car = carMapper.findCarDetail(id);
       return car;
    }

}
