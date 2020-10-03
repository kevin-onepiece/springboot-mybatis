package com.kevin.mybatis.mapper;


import com.kevin.mybatis.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author:kevinfoo
 * @date:2020/10/03
 * @file:com.kevin.springboot.mybatis.mapper
 */
@Component
public interface UserMapper {

    /**
     * 通过用户id查询用户
     * @param userId
     * @return
     */
    User selectSingle(Long userId);

}
