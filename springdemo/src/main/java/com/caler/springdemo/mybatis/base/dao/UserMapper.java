package com.caler.springdemo.mybatis.base.dao;

import com.caler.springdemo.mybatis.base.entity.User;
import org.apache.ibatis.annotations.Select;

/**
 * @author Caler_赵康乐
 * @create 2020-03-07 11:05
 * @description :
 */
public interface UserMapper {

    @Select("select * from account where id=#{id}")
    public User getUserById(Integer id);
}
