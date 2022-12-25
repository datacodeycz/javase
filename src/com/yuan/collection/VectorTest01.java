package com.yuan.collection;

import java.util.*;
/*
Vector:
    1、底层也是一个数组。
    2、初始化容量为：10。
    3、怎么扩容的？
        扩容之后是原容量的2陪（可以用debug测试）

    4、ArrayList集合扩容特点：
        ArrayList集合扩容是原容量的1.5倍。
    5、Vector中所有的方法都是线程同步的，都带有synchronized关键字
        是线程安全的。效率比较低，使用较少了。
    6、怎么将一个线程不安全的ArrayList集合转换成线程安全的呢？
        使用集合工具类：
            java.util。Collections；

            java.util。Collection 是集合接口。
            java.util。Collections 是集合工具类。
 */

public class VectorTest01 {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        vector.add(11);

        System.out.println(vector.size());

        Iterator iterator = vector.iterator();

        while(iterator.hasNext()){
            Object object = iterator.next();
            System.out.println(object);
        }
        //以后可能会用
        List myList = new ArrayList();//目前是非线程安全的

        //变成线程安全的
        Collections.synchronizedList(myList);


        //myList集合就是线程安全的了。
        myList.add("123");
        myList.add("456");
        myList.add("789");

    }
}
