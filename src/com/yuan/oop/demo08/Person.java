package com.yuan.oop.demo08;

public class Person {


    //2.
    {
        System.out.println("匿名代码块");
    }
    //1. 只执行一次
    static {
        System.out.println("静态代码块");
    }

    //3.
    public Person() {
        System.out.println("构造代码块");
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("======");
        Person person1 = new Person();


    }
}
