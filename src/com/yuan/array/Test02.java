package com.yuan.array;

//初始化
public class Test02 {
    public static void main(String[] args) {
        //静态初始化
        int [] a = {1,2,3,4,5,6,7};
        System.out.println(a[1]);

        //动态初始化: 包含默认初始化
        int [] b = new int[10];
        b[0] = 10;
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

    }
}
