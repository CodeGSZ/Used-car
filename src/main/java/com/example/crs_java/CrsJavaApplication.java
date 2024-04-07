package com.example.crs_java;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.crs_java.mapper")
@SpringBootApplication
public class CrsJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrsJavaApplication.class, args);
    }

}
