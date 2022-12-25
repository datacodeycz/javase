package com.yuan.oop.demo08;

//静态导入包，精确到哪个方法
import static java.lang.Math.random;
import static java.lang.Math.PI;
public class Test {
    public static void main(String[] args) {
        System.out.println(PI*random());
    }
}
/*
注：被final定义的类不能继承
 */