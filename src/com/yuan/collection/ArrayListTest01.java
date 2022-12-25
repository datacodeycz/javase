package com.yuan.collection;

import java.util.ArrayList;
import java.util.List;

/*
ArrayList集合：
   1、默认初始化容量10（底层先建立了一个长度为0的数组，当添加第一个元素的时候，初始化容量为10）
   2、集合底层是一个Object[]数组。
   3、构造方法：
        new ArrayList();
        new ArrayList(20);
    4、ArrayList集合的扩容：
        原容量的1.5倍。
        ArrayList集合底层是数组，怎么优化？
            尽可能少的扩容。因为数组扩容效率比较低，建议在使用ArrayList集合
            的时候预估计元素的个数，给定一个初始化容量。
   5、数组优点：
       检索效率比较高。
   6、
       随机增减元素效率比较低
   7、向数组末尾添加元素，效率很高，不受影响。
   8、 这么多的集合中，用ArrayList集合更多
            原因： 往数组末尾添加元素，效率不受影响。
                  另外，我们检索/查找某个元素的操作比较多
   9、ArrayList是非线程安全的。
 */
public class ArrayListTest01 {
    public static void main(String[] args) {


        //默认初始化容量是10
        //数组的长度是10
        List list1 = new ArrayList();
        //指定初始化容量
        //数组的长度是20
        List list2 = new ArrayList(20);


        //集合的size()方法是获取当前集合中元素的个数。
        System.out.println(list1.size());//0
        System.out.println(list2.size());//0

        list1.add(1);
        list1.add(2);
        list1.add(4);
        list1.add(3);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);

        System.out.println(list1.size());

        //再添加一个元素
        list1.add(11);
        /*
        这里的容量扩充涉及到位运算
            100 二进制转换为十进制：00000100 右移一位 00000010 变为原来的一半

            所以这个的容量增长是原来的1.5倍
         */

    }
}
