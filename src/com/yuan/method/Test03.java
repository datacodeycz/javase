package com.yuan.method;

//方法的重载
/*
规则：
方法名称必须相同
参数列表必须不同（个数不同，类型不同，参数排列顺序不同等）
方法的返回类型可以相同也可以不相同
仅仅返回类型不同不足以成为方法的重载。
 */
public class Test03 {
    public static void main(String[] args) {
        double x = max(10,20);
        System.out.println(x);
        int y = max(20,30);
        System.out.println(y);

    }
    public static int max(int num1,int num2){
        int max;
        if(num1==num2){
            System.out.println("num1==num2");
        }
        if(num1>num2){
            max = num1;
        }else{
            max = num2;
        }
        return max;
    }

    public static double max(double num1,double num2){
        double max;
        if(num1==num2){
            System.out.println("num1==num2");
        }
        if(num1>num2){
            max = num1;
        }else{
            max = num2;
        }
        return max;
    }
}
