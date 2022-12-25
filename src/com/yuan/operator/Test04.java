package com.yuan.operator;

//一元运算
public class Test04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        //++在后面时 先赋值 再++
        int c = a++;
        //++在前面时，先++ 再赋值   -- 同理
        int d = ++a;
        int f = ++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        System.out.println(c);
        System.out.println(f);
        //幂运算使用工具类进行操作 Math类
        double pow = Math.pow(3,4);
        System.out.println(pow);
        System.out.println(Math.pow(2,3));


    }


}
