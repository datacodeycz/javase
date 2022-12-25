package com.yuan.collection.review;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
LinkedList
 回顾：
        每个集合对象的创建（new）
        向集合中添加元素
        从集合中取出某个元素
        遍历集合
 */
public class LinkedListTest {
    public static void main(String[] args) {

        //LinkedList集合的创建
        List<Integer> list = new LinkedList<>();

        //向集合中添加元素
        list.add(123);
        list.add(408);
        list.add(400);
        list.add(874);
        list.add(234);

        //通过下标获取元素（链表依然有下标）
        list.get(0);

        //集合的遍历

        //通过下标进行遍历
        for (int i = 0; i < list.size(); i++){
            int l = list.get(i);
            System.out.println(l);
        }

        //通过增强for循环进行遍历
        for ( Integer l : list){
            System.out.println(l);
        }

        //通过迭代器进行遍历

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            Integer l = iterator.next();
            System.out.println(l);
        }

    }
}
