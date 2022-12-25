package com.yuan.oop.demo01;

//实参和形参
public class Test03 {
    public static void main(String[] args) {
        //实际参数和形式参数的类型要对应！
        int add = Test03.add(1,2);
        System.out.println(add);
    }
    //下面的a ，b均为形参，实际不存在的
    public static int add(int a,int b){
        return a+b;
    }
}
