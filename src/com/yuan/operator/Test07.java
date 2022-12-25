package com.yuan.operator;

//运算符 字符串连接符
public class Test07 {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        a+=b; //a=a+b
        b-=a; // b=a-b
        System.out.println(a);
        System.out.println(b);
        //字符串连接符 +，转化为String
        System.out.println(""+a+b);//这里""在前面 a+b转化为了字符串
        System.out.println(a+b+"");//这里""在后面 先计算了结果

    }
}
