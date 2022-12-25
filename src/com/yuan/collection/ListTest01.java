package com.yuan.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
测试list接口中常用方法
    1.list集合存储元素特点：有序可重复
        有序：list集合中的元素有下标。
        从0开始：以1递增。
        可重复：存储一个1，还可以再存储1。
    2.List既然是Collection接口的子接口，那么肯定list接口有自己“特色”的方法：
        以下只列出List接口特有的常用的方法：
            void add(int in)
            int indexOf(Object o)dex,Object element)
            Object get(int index)
            int lastIndexOf(Object o)
            Object remove(int index)
            Object set(int index,Object element)
        不用死记硬背！
 */
public class ListTest01 {
    public static void main(String[] args) {

        //创建list类型的集合
        //List list = new LinkedList();
        // List list = new Vector();
        List list = new ArrayList();

        //添加元素
        list.add("A");  //默认都向集合末尾添加元素。
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("D");

        System.out.println(list.size());

        //在列表的指定位置插入指定元素（第一个参数是下标）
        //这个方法使用不多，因为对于ArrayList集合来说效率比较低
        list.add(1,1);

        //迭代
        Iterator iterator = list.iterator();

        while(iterator.hasNext()){
            Object oj = iterator.next();
            System.out.println(oj);
        }

        //获取下标的第几个元素的值
        System.out.println(list.get(2));

        //获取指定对象出现的第一次索引
        System.out.println(list.indexOf("C"));

        //获取指定对象出现的最后一次索引
        System.out.println(list.lastIndexOf("D"));

        //删除下标指定元素
        //删除下标为0的元素
        list.remove(0);
        System.out.println(list.size());

        //修改指定位置元素
        list.set(2,"ycz");

        //因为有下标，所以list集合有自己比较特殊的遍历方式
        //通过下标遍历。[List集合特有的方式，set没有。]
        for (int i = 0; i <list.size() ; i++) {

            Object object = list.get(i);
            System.out.println(object);

        }

    }
}
