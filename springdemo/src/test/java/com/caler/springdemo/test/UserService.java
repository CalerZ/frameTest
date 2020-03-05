package com.caler.springdemo.test;

/**
 * @author Caler_赵康乐
 * @create 2020-03-04 11:36
 * @description :
 */
public class UserService {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
