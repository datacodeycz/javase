package com.yuan.oop.demo10;

//interface 为定义接口的关键字，接口都需要有实现类
public interface UserService {

    //定义的常量都是 public static final 类型的
    int AGE = 99;


    //定义的方法都是 public abstract 类型的
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);

}
