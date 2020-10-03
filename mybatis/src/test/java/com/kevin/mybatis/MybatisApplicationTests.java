package com.kevin.mybatis;

import com.kevin.mybatis.entity.User;
import com.kevin.mybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        User user = userMapper.selectSingle(13L);
        System.out.println("user is : " + user);
    }

}
