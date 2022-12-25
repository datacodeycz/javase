package com.yuan.java.oop.demo01;
/*
数据类型包括两种：
基本数据类型：byte short int long float double boolean char
引用数据类型：String Student

java中所有的“类”都属于引用数据类型
 */
public class StudentTest {
    public static void main(String[] args) {
//        studentYcz属于局部变量
        // 这个局部变量叫引用
        Student studentYcz = new Student();
        // 这个也是一个局部变量
        Student studentJava = new Student();

        // 访问实例变量
        //语法： 引用.实例变量名
        studentYcz.age = 20;
        studentYcz.name = "ycz";
        studentYcz.sex = true;
        studentYcz.id = "20200101";
        System.out.println(studentYcz.name);
    }
}
