package com.yuan.collection;

import java.util.Set;
import java.util.TreeSet;

/*
TreeSet存储特点：
    1、无序不重复的，但是存储的元素可以自动按照大小顺序排序！
       称为：排序集合
    2、无序这里是指存进去的顺序和输出的顺序不同
 */
public class TreeSetTest01 {
    public static void main(String[] args) {
        //创建ThreeSet集合
        Set<String> stringSet = new TreeSet<>();

        //添加元素
        stringSet.add("A");
        stringSet.add("B");
        stringSet.add("Z");
        stringSet.add("Y");
        stringSet.add("K");
        stringSet.add("P");
        stringSet.add("E");
        stringSet.add("E");
        for (String s : stringSet){
            System.out.println(s);
        }
    }
}
