package com.yuan.collection;

/*
位运算
     例如：
            二进制：00001010  转换为十进制为 10
            ||向右移一位后
            二进制：00000101  转换为十进制为 5

 */
public class BinaryTest {
    public static void main(String[] args) {

        //左移一位扩大2倍
        //由二进制位运算可得
        System.out.println(100 << 1);
        System.out.println(100 << 2);

        //右移一位缩小2倍
        //同样是由二进制决定的
        System.out.println(100 >> 1);
        System.out.println(100 >> 2);
    }
}
