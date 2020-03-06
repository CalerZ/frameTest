package com.caler.springdemo.spring.tx.service;


import com.caler.springdemo.spring.tx.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Caler_赵康乐
 * @create 2020-03-06 12:29
 * @description :
 */
@Service("userService")
public class UserserviceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    public void transfer() {
        userDao.out("jack",1000);
        int b = 1/0;
        userDao.in("rose",1000);
    }
}
