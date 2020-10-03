package com.kevin.mybatisplus;

import com.kevin.mybatisplus.entity.User;
import com.kevin.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlusApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {

        User user = userMapper.selectSingle(13L);
        System.out.println("user is : " + user);

    }

}
