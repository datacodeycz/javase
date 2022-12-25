package com.yuan.oop.demo02;

//学生类
public class Student {
    //属性
    String  name;//初始值为null
    int age;//初始值为0

    //方法
    public void study(){
        System.out.println(this.name+"在学习");
    }

}
//可以将世界分类建模处理
/*
//类：抽象的，需要实例化
    //类实例化后会返回一个自己的对象！
    //student对象就是一个Student类的具体实例！
    public static void main(String[] args) {
        Student ycz = new Student();
        Student zwy = new Student();

        ycz.name = "袁成志";
        ycz.age  = 19 ;
        zwy.name = "曾维勇";
        zwy.age = 20 ;

        System.out.println(ycz.name);
        System.out.println("年龄为"+ycz);

        System.out.println(zwy.name);
        System.out.println("年龄为"+zwy.age);
}
 */