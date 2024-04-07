package com.example.crs_java.mapper;

import com.example.crs_java.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest             //表示这是一个测试类，不会随项目一起打包
@RunWith(SpringRunner.class)     //表示启动这个测试类，不写这个测试类不会运行，需要传递一个springRunner实例类型
public class UserMapperTest {
    @Autowired
    private UserAddMapper userAddMapper;
    /*
        1.必须被Test注解所修饰
        2.返回值类型必须是void类型，其他类型会报错
        3.方法的参数列表不能制定任何类型
        4.方法的访问修饰符必须是public
     */
    @Test
    public void testSelectAll () {
        User user = new User();
        System.out.println( userAddMapper.AddUser(user));
    }
}
