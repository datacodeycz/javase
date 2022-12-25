package com.yuan.struct;

//break
public class Test06_Break {
    public static void main(String[] args) {
        int i = 0;
        while(i<100){
            i++;
            System.out.println(i);
            if(i==30){
                break;//退出while整个循环;
            }
        }
        System.out.println("123");
    }
}
