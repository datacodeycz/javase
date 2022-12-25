package com.yuan.oop.demo02;

public class Person {

    //一个类即使什么都不写，也会存在一个方法
    //显示定义构造体
    String name;
    int age;

    //无参构造
    //1.使用new，本质是在调用构造体
    //2.用来初始化值

    //有参构造：一旦定义了有参构造，无参必须显示定义
    public Person(String name){
        this.name =name;
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;

    }

}
/*
 public static void main(String[] args) {

        //实例化一个对象
        Person ycz = new Person();
        Person ysc = new Person("于士川",19);

        System.out.println(ysc.name);
        System.out.println(ysc.age);
    }

    构造器：
    1.和类名相同
    2.没有返回值
    作用：
    1.new的本质在于调用构造方法
    2.初始化对象的值
    注意点：
    有参构造：一旦定义了有参构造，无参必须显示定义

快捷键（快速构造无参有参方法） ALT+INSERT（小键盘的0）；

 */