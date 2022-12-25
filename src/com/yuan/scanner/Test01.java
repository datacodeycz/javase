package com.yuan.scanner;

import java.util.Scanner;
public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数据：");
        if(scanner.hasNextInt()) {

            String str = scanner.nextLine();
            System.out.println("你输入的数据为:" + str);
        }
        else{
            System.out.println("你输入的不是整数！");
        }
        scanner.close();
    }
}
