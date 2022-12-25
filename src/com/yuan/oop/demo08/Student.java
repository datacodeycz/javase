package com.yuan.oop.demo08;

//static
public class Student {

    public static int ago;//静态属性
    public double score;//非静态属性

    public void run(){
        System.out.println("run");
    }
    public static void go(){
        System.out.println("go");
    }

    public static void main(String[] args) {
        ago=1;//静态属性可以直接在主方法中使用
        Student student = new Student();
        student.score=1;//非静态属性需要实例化 才可以
        //方法同理
        go();
        student.run();
    }
}
