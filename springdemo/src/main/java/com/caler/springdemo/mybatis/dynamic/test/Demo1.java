package com.caler.springdemo.mybatis.dynamic.test;

import com.caler.springdemo.mybatis.dynamic.entity.Department;
import com.caler.springdemo.mybatis.dynamic.entity.User;
import com.caler.springdemo.mybatis.dynamic.dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author Caler_赵康乐
 * @create 2020-03-08 13:18
 * @description :
 */
public class Demo1 {


    public static void main(String[] args) throws FileNotFoundException {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory = builder.build(new FileInputStream("/conf/mybatis-conf.xml"));
        SqlSession sqlSession = sessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUser( new User(1,"%a%",520,new Department(1,"")));
        System.out.println(user);
        sqlSession.close();
    }

}
