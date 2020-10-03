package com.kevin.mybatisplus.mapper;

import com.kevin.mybatisplus.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author:kevinfoo
 * @date:2020/10/03
 * @file:com.kevin.springboot.mybatis.mapper
 */
@Component
@Mapper
public interface UserMapper {

    /**
     * 通过用户id查询用户
     * @param userId
     * @return
     */
    User selectSingle(Long userId);

}
