package com.yuan.scanner;

import java.util.Scanner;
public class Test02 {
    public static void main(String[] args) {
        //输入到界面
        Scanner scanner = new Scanner(System.in);
        int t = 0;
        float f = 0.0f;
        System.out.println("请输入数据：");
     if(scanner.hasNextFloat()){
         f = scanner.nextFloat();
         //获取数据
         System.out.println("你输入的数据为："+f);
     }else{
         System.out.println("你输入的数据不是小数！");
     }
     if(scanner.hasNextInt()){
         t = scanner.nextInt();
         System.out.println("你输入的数据为："+t);
     }
     else
     {
         System.out.println("你输入的不是整数！");
     }
     scanner.close();//关闭
    }
}
