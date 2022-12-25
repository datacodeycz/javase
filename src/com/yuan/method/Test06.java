package com.yuan.method;

//递归结构
//A方法调用A方法
/*
递归结构包括两个部分：
递归头：什么时候不调用自身方法。如果没有头，将陷入死循环。
递归体：什么时候需要调用自身方法。
 */
public class Test06 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    public static int f(int n){
        //头
        if(n==1){
            return 1;
        }else{
            return n*f(n-1);
        }
    }

}
