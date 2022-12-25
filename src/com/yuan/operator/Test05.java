package com.yuan.operator;

//逻辑运算符
public class Test05 {
    public static void main(String[] args) {
        /*&& 与（and） 二者都有（true）
          || 或 （or） 二者有一即可
          ！ 非（取反）
          */
        Boolean a = false ;
        boolean b = true;
        System.out.println(a&&b);
        System.out.println(a||b);
        System.out.println(!b);
        System.out.println("!(a&&b):"+!(a&&b));
    }
}
