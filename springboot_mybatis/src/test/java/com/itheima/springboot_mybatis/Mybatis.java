package com.itheima.springboot_mybatis;

import com.itheima.SpringbootMybatisApplication;
import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class Mybatis {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        List<User> users =userMapper.queryUserList();
        System.out.println(users);
    }

    @Test
    public void test2(){
        List<User> users =userMapper.queryUserList();
        System.out.println(users);
    }
}
