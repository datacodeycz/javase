package com.yuan.collection;

import java.util.TreeSet;

/*
1、ThreeSet集合底层实际上是一个TreeMap
2、TreeMap集合底层是一个二叉树。
3、放到treeSet集合中的元素，等同于放到TreeMap集合key部分了
4、TreeSet集合中的元素 无序不可重复，但是可以按照元素的大小顺序自动排序。
称为：可排序集合
 */
public class TreeSetTest02 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        //添加String元素
        treeSet.add("ycz");
        treeSet.add("yuan");
        treeSet.add("cheng");
        treeSet.add("zhi");

        //遍历集合
        for(String str : treeSet){
            System.out.println(str);
        }



        TreeSet<Integer> treeSet1 = new TreeSet<>();
        //添加元素
        treeSet1.add(123);
        treeSet1.add(122);
        treeSet1.add(100);
        treeSet1.add(1000);
        treeSet1.add(1999);
        //遍历treeSet集合 按照默认顺序为升序
        for (Integer Str : treeSet1){
            System.out.println(Str);
        }

    }
}
