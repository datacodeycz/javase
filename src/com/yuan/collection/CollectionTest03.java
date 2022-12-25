package com.yuan.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
集合遍历/迭代
 */
public class CollectionTest03 {
    public static void main(String[] args) {
        //创建ArrayList集合 有序可重复。
        Collection collection = new ArrayList();

        //在集合中添加元素
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);

        //迭代集合
        Iterator iterator = collection.iterator();

        while(iterator.hasNext()){
            //存进去是什么类型，取出来还是什么类型。
            //只不过在输出的时候会转换成字符串，因为这里println会调用toString()方法;
            System.out.println(iterator.next());
        }

        //创建HashSet集合，无序不可重复
        Collection collection1 = new HashSet();

        //无序：存进去和取出来的顺序不一定相同。
        //不可重复：存储100，不能再存储100
        collection1.add(100);
        collection1.add(300);
        collection1.add(200);
        collection1.add(400);
        collection1.add(500);
        collection1.add(700);
        collection1.add(800);
        collection1.add(100);

        Iterator iterator1 = collection1.iterator();
        while(iterator1.hasNext()) {
            Object object = iterator1.next();
            System.out.println(object);
        }
    }
}
