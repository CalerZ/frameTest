package com.caler.springdemo.spring.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * @author Caler_赵康乐
 * @create 2020-03-06 12:28
 * @description :
 */
@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void in(String inner, int money){
        this.jdbcTemplate.update("update account set money=money+? where name =?",money,inner);
    }

    public void out(String outter,int money){

        this.jdbcTemplate.update("update account set money=money-? where name =?",money,outter);

    }
}
