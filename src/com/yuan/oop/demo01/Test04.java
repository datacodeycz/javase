package com.yuan.oop.demo01;

//值传递
public class Test04 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);
        change(a);
        System.out.println(a);
    }
    //返回值为null
    public static void change(int a){
        a = 10;
    }
}
/*
在调用该方法时，只是将 main方法中的a值给到了change中的a的值
然后将change中的a赋值为10
这个没有将change中的a的值返回到main中的a
所以main中的a仍然为1
所以两次输出结果均为1
 */
