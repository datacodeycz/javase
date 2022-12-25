package com.yuan.oop.demo01;

public class Test02 {
    public static void main(String[] args) {
        Student.say1();
        //实例化这个类 new
        //语法： 对象类型 对象名字 =  对象值
        Student student = new Student();
        student.say2();
        //见Student类
    }
    //静态方法和类一起加载的
    public  static void a(){
        b();
    }
    public static void b(){

    }
    //非静态方法 当类实例化后 才存在
    public void c(){
        d();
    }
    public void d(){
        c();
    }
}
/*
在main方法中，因为main为静态方法（关键字为static）所以在main中只能直接调用静态方法
不能直接调用非静态方法 需要将该方法实例化 即可调用
 */
