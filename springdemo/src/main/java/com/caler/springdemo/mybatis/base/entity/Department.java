package com.caler.springdemo.mybatis.base.entity;

import java.util.List;

/**
 * @author Caler_赵康乐
 * @create 2020-03-07 15:50
 * @description :
 */
public class Department {

    private Integer id;
    private String deptName;


    private List<User> users;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
