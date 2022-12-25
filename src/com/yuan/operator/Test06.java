package com.yuan.operator;

//位运算
public class Test06 {
    public static void main(String[] args) {
        /*
        A = 0011 1100
        B = 0000 1101
        A&B = 0000 1100
        A|B = 0011 1101
        A^B = 0011 0001
        ~B = 111 0010
        面试题：2*8=16 怎么最快实现
        2*2*2*2 =16
        << *2
        >> /2
        运算速度极快
         */
        System.out.println(2<<3);
    }
}
