package com.yuan.operator;

/**
 * @author 袁成志
 * @since 1.8
 * @version 1.0
 *
 */
public class Test02 {

    static  final int name=100;
    public static void main(String[] args) {
        //JDK 新特性 可以在数字中加横线，方便查看

        int money = 10_0000_0000;
        int years = 20;
        long totas = money * (long)years;
        System.out.println(totas);
    }

}
