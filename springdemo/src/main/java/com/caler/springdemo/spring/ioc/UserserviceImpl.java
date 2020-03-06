package com.caler.springdemo.spring.ioc;


import com.caler.springdemo.spring.tx.dao.UserDao;
import com.caler.springdemo.spring.tx.service.UserService;
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

public class UserserviceImpl implements UserService {

    public void transfer() {
        System.out.println("ioc测试");
    }
}
