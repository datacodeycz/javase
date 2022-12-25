package com.yuan.method;

//方法法
public class Test01 {

    public static void main(String[] args) {
        //实际参数：实际调用的参数
        int sum=add(1,2);
        System.out.println(sum);
        int max = max(10,20);
        System.out.println(max);
    }
    /*
     *这为一个方法
     */


    /*
    修饰符 返回类型 方法名（参数类型 参数名）{
    ...
    方法体
    ....
    有返回值 就要有返回值

    return
    }
     */
    public static int add(int a, int b){
        return a+b;
    }


public static int max(int num1,int num2) {
    int result;
    if (num1 == num2) {
        System.out.println("num1==num2");
        return 0;
    }
    if (num1 > num2) {
        result = num1;
    } else {
        result = num2;
    }
    return result;
}

}
