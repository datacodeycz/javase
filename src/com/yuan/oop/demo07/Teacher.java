package com.yuan.oop.demo07;

public class Teacher extends Person {


}
/*
//Object > Person > Teacher
        //Object > Person > Student
        Object object = new Student();

        System.out.println(object instanceof Object);//true
        System.out.println(object instanceof Person);//true
        System.out.println(object instanceof Student);//true
        System.out.println(object instanceof Teacher);//false
        System.out.println(object instanceof String);//false

        Person person = new Student();
        System.out.println("====================");
        System.out.println(person instanceof Object);//true
        System.out.println(person instanceof Person);//true
        System.out.println(person instanceof Student);//true
        System.out.println(person instanceof Teacher);//false
        //System.out.println(person instanceof String); 编译报错
        Student student = new Student();
        System.out.println("====================");
        System.out.println(student instanceof Object);//true
        System.out.println(student instanceof Person);//true
        System.out.println(student instanceof Student);//true
        //System.out.println(student instanceof Teacher);编译报错
        //System.out.println(person instanceof String); 编译报错




 */