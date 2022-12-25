package com.yuan.struct;

//测试类
public class Test08 {
    public static void main(String[] args) {
        //打印三角形 5行
        for (int i = 1; i <=5; i++) {
            for(int j = 5;j>=i;j--){
                System.out.print(" ");
            }//打印空白的左上三角
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }//打印带星号的右下角
            for(int j=1;j<i;j++){
                System.out.print("*");
            }//打印带星号的左下角
            System.out.println();
        }

    }
}
