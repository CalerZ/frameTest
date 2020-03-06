package com.caler.springdemo.spring.tx.test;

import com.caler.springdemo.spring.tx.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Caler_赵康乐
 * @create 2020-03-06 13:19
 * @description :
 */
public class Test {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean_tx.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.transfer();
    }
}
