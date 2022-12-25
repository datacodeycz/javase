package com.yuan.exception.demo01;

public class Test02 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        //CTRL+ALT+t 快捷生成
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.exit(1);
            e.printStackTrace();//打印错误的栈信息
        }
    }
}
