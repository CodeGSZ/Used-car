package com.example.crs_java.service;

import com.example.crs_java.entity.Car;
import com.example.crs_java.entity.Order;
import com.example.crs_java.entity.User;
import com.example.crs_java.service.ex.ServiceException;
import com.example.crs_java.service.impl.CarAndDetailService;
import com.example.crs_java.service.impl.OrderedService;
import com.example.crs_java.service.impl.UserServiceLogin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.rowset.serial.SerialException;
import java.util.List;

@SpringBootTest             //表示这是一个测试类，不会随项目一起打包
@RunWith(SpringRunner.class)
public class UserService {
    @Autowired
    private IUserService userService;

    @Autowired
    private UserServiceLogin userServiceLogin;

    @Autowired
    private CarAndDetailService carAndDetailService;

    @Autowired
    private OrderedService orderedService;
    @Test
    public void TestAddUser () {
        try {
            User user = new User();
            user.setName("测试用户");
            user.setPassword("00000");
            user.setTel("1008611");
            user.setSex("男");
            user.setBirthday("2000-10-10");
            userService.reg(user);
            System.out.println("OK, 添加成功！");
        } catch (ServiceException e) {
            //先获取异常的类名，在获取类的名称
            System.out.println(e.getClass().getSimpleName());
            //打印异常信息
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void login () {
        User user = userServiceLogin.UserLogin("小明","root");
        System.out.println(user);
    }

    @Test
    public void cardetailtest () {
        Car car = new Car();
        Car cartestData = carAndDetailService.cardetail(1);
        System.out.println(cartestData);
    }

    @Test
    public void updatatestInf () {
        Integer rows = userServiceLogin.updataInf(2,"测试更改用户信息", "123456");
        System.out.println(rows);
    }

    @Test
    public void updatateaddressTest () {
        Integer rows = userServiceLogin.updateAddSer(22,"桂林信息科技学院");
        System.out.println(rows);
    }

    @Test
    public void selectOrderedTest () {
        List<Order> data = orderedService.selectOrdered();
        System.out.println(data);
    }

}
