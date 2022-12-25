package com.yuan.collection.review;

import java.util.HashSet;
import java.util.Iterator;

/*
回顾：
        每个集合对象的创建（new）
        向集合中添加元素
        从集合中取出某个元素
        遍历集合
        测试HashSet集合的特点：无序不可重复
 */
public class HashSetTest {
    public static void main(String[] args) {

        //创建集合对象
        HashSet<String> hash = new HashSet<>();

        //向集合中添加元素
        hash.add("ycz7");
        hash.add("ycz5");
        hash.add("ycz3");
        hash.add("ycz4");
        hash.add("ycz3");
        hash.add("ycz9");

        //对于HashSet集合而言 无法单个取出对象

        //证明HashSet是无序不可重复的
        //通过迭代器的方式进行遍历
        Iterator<String> iterator = hash.iterator();

        while(iterator.hasNext()){
            String h = iterator.next();
            System.out.println(h);
        }

        //增强for循环进行遍历
        for (String h : hash){
            System.out.println(h);
        }


    }


}
