package com.yuan.Thread;

//就一个主线程，只是方法的调用，都属于一个栈 ，入栈弹栈
public class TestThread02 {
    public static void main(String[] args) {
        System.out.println("main开启");
        m1();
        System.out.println("main22");
    }
    static void m1(){
        System.out.println("m1开启");
        m2();
        System.out.println("m111");
    }
    static void m2(){
        System.out.println("m2开启");
        m3();
        System.out.println("m222");
    }
    static void m3(){
        System.out.println("m3");

    }
}
