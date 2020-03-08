package com.caler.springdemo.mybatis.dynamic.entity;

/**
 * @author Caler_赵康乐
 * @create 2020-03-07 11:03
 * @description :
 */
public class User {

    private Integer id;
    private String name;
    private Integer money;

    private Department dept;

    public User() {
    }

    public User(Integer id, String name, Integer money, Department dept) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.dept = dept;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
