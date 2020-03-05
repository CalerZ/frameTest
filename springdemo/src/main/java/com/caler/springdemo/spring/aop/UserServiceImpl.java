package com.caler.springdemo.spring.aop;

import org.springframework.stereotype.Service;

/**
 * @author Caler_赵康乐
 * @create 2020-03-05 22:12
 * @description :
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public void updateUser() {
        System.out.println("更新用户");
    }

    @Override
    public void deteleUser() {
        System.out.println("删除用户");
    }
}
