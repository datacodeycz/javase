package com.yuan.collection;

import java.util.TreeSet;

/*
对自定义的类型来说，TreeSet可以排序吗？
    以下程序中对于Person类型来说，无法排序。因为没有指定Person对象之间的比较规则。
    谁大谁小并没有说明啊。

    以下程序运行的时候出现了这个异常：
    java.lang.ClassCastException:
    com.yuan.collection.Person
    cannot be cast to java.lang.Comparable
出现这个异常的原因是：
    Person类没有实现java.lang.Comparable接口

 */
public class TreeSetTest03 {
    public static void main(String[] args) {
        Person s1 = new Person(32);
        Person s2 = new Person(23);
        Person s3 = new Person(325);
        Person s4 = new Person(20);
        Person s5 = new Person(19);

        TreeSet<Person> per =  new TreeSet<>();

        per.add(s1);
        per.add(s2);
        per.add(s3);
        per.add(s4);
        per.add(s5);

        for(Person p : per){
            System.out.println(p);
        }


    }
}
class Person{
    int age;

    public  Person(int age){
        this.age = age;
    }
}