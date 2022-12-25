package com.yuan.collection.review;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
ArrayList
    回顾：
        每个集合对象的创建（new）
        向集合中添加元素
        从集合中取出某个元素
        遍历集合
 */
public class ArrayListTest {
    public static void main(String[] args) {

        //创建ArrayList集合
        List<String> list = new ArrayList<>();

        //添加元素
        list.add("ycz1");
        list.add("ycz2");
        list.add("ycz3");
        list.add("ycz4");

        //从集合中取出某个元素
        //ArrayList底层是数组 有下标 可以直接通过下标取出元素
        System.out.println(list.get(0));

        //集合中的元素个数
        System.out.println(list.size());

        //通过下标进行遍历
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        //通过增强For循环进行遍历

        for (String s : list){
            System.out.println(s);
        }

        //通过迭代器的方法进行遍历
        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
