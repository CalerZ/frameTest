package com.caler.springdemo.mybatis.base.test;

import com.caler.springdemo.mybatis.base.dao.UserMapper;
import com.caler.springdemo.mybatis.base.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author Caler_赵康乐
 * @create 2020-03-07 11:06
 * @description :
 */
public class Demo1 {

    @Test
    public void test1() throws FileNotFoundException {
        //mybatis接口式编程
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory session = sqlSessionFactoryBuilder.build(new FileInputStream("src\\main\\resources\\conf\\mybatis-conf.xml"));
        SqlSession sqlSession = session.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
    }

}
