package com.yuan.reflect.reflect;

/*
可变长参数：
    语法格式:int ...args 这就是可变长度参数

    1.可变长度参数要求的参数个数是0~N个
    2.可变长度参数在参数列表中必须在最后一个位置上，而且可变长度参数只能有1个
    3.可变长度参数可以当做一个数组来看待
 */
public class ArgsTest {
    public static void main(String[] args) {
        m(1,2,3,4);
        m(213213,123213);
        m(1);
        m2("ycz","java","javase");
    }

    public static void m(int ...a){
        System.out.println("m方法执行了");
    }
    /*
    编译报错，可变长度参数在参数列表中必须在最后一个位置上，有且只有一个
    public static void m1(int ...args, String a){

    }*/
    public static void m2(String ...str){
        for(int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
    }
}
