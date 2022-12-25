package com.yuan.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest06 {
    public static void main(String[] args) {

        //创建集合对象
        Collection collection = new ArrayList();

        //注意：此时获取的迭代器，指向的是那是集合中没有元素状态下的迭代器。
        //一定要注意：集合结构只要发生改变，迭代器必须重新获取。

        //当集合结构发生了改变，迭代器没有重新获取时，调用next()方法时：java.util.ConcurrentModificationException
//        Iterator iterator = collection.iterator();
        //在集合中添加元素
        collection.add("123");
        collection.add("ycz");
        collection.add("tb");
        collection.add("yuan");
        collection.add("zhi");
        collection.add("bing");

        //获取迭代器
        Iterator iterator = collection.iterator();

        while(iterator.hasNext()){
            //编写代码时next()方法返回值类型必须是Object.
            Object object = iterator.next();
            System.out.println(object);
        }

        Collection collection1 = new ArrayList();

        collection1.add("1");
        collection1.add("ycz");
        collection1.add("tb");
        collection1.add("yuan");
        collection1.add("zhi");
        collection1.add("tang_bing");

        Iterator iterator1 = collection1.iterator();

        while(iterator1.hasNext()){
            Object object1 = iterator1.next();
            //删除元素
            //删除元素之后，集合的结构发生了改变，应该重新去获取迭代器
            //但是，循环下一次的时候并没有重新获取迭代器，所以会出现异常：java.util.ConcurrentModificationException
            //出现异常根本原因是：集合中元素删除了，但是没有更新迭代器（迭代器不知道集合变化了）
            //collection1.remove（object1）;//直接通过集合去删除元素，没有通知迭代器。（导致迭代器的快照和原集合状态不同。）
            //使用迭代器来删除可以吗？
            //迭代器去删除时，会自动更新迭代器，并且更新集合（删除集合中的元素）
            iterator1.remove();//删除的一定是迭代器指向的当前元素。
            System.out.println(object1);
        }
        System.out.println(collection1.size());
    }
}
