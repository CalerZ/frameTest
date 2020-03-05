package com.caler.springdemo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Caler_赵康乐
 * @create 2020-03-04 11:24
 * @description :
 */
public class Test {

    @org.junit.jupiter.api.Test
    public  void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object userService = applicationContext.getBean("userService");
        System.out.println(userService);

    }
}
