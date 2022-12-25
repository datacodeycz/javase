package com.yuan.oop.demo05;

//继承
public class A extends B {
    @Override//注释 ：有功能的注释
    public void test() {
        System.out.println("A==>test");
    }

}
/*
public class Application{
    //静态方法与非静态方法区别很大
    //静态方法： 方法的调用只跟左边，定义的数据类型有关
    //非静态方法：重写（才算重写）
    public static void main(String[] args) {
        A a = new A();
        a.test();
        B b = new A();//子类重写了父类的方法
        b.test();
    }

}
 */
