package com.caler.springdemo.mybatis.base.dao;

import com.caler.springdemo.mybatis.base.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Caler_赵康乐
 * @create 2020-03-07 11:05
 * @description :
 */
public interface UserMapper {

    @Select("select * from account where id=#{id}")
    public User getUserById(@Param("id") Integer id);

    /**
     * 增删改可以返回integer long boolean
     * 增加时可以返回主键
     * @param user
     */
    public void addUser(User user);


    public List<User> getUserByDeptId(Integer deptid);
}
