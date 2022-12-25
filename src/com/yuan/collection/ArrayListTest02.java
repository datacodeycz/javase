package com.yuan.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/*
集合ArrayList的构造方法
 */
public class ArrayListTest02{
    public static void main(String[] args) {
        //默认初始化容量为10
        List list1 = new ArrayList();
        //默认初始化容量为20
        List list2 = new ArrayList(20);

        //创建一个HashSet集合
        Collection c = new HashSet();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);

        //通过这个构造方法就可以将HashSet集合转换成ArrayList集合
        List list3 = new ArrayList(c);

        System.out.println(list3.size());

        //通过下标遍历
        for (int i = 0; i <list3.size() ; i++) {

            System.out.println(list3.get(i));

        }

    }
}
