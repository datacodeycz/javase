package com.yuan.array;

/*
数组的四个基本特点：
其长度是确定的。数组一旦被创建，它的大小就是不可以改变的。
其元素必须是相同类型，不允许出现混合类型。
数组中的元素可以是任何数据类型，包括基本类型和引用类型
数组变量属引用类型，数组也可以看成是对象，数组中的每个元素相当于该对象的成员变量。
数组本身就是对象，java中对象是在堆中的，因此数组无论保存原始类型还是其他对象类型，
数组对象本身是在堆中的
 */
public class Test03 {
    public static void main(String[] args) {
        int [] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}

