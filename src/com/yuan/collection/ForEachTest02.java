package com.yuan.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
集合使用增强for
 */
public class ForEachTest02 {
    public static void main(String[] args) {

        //创建ArrayList集合
        List<String> strList = new ArrayList<>();

        //添加对象
        strList.add("Hello");
        strList.add("World");
        strList.add("YCZ");

        //使用迭代器进行遍历
        Iterator<String> iterator = strList.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }

        System.out.println("======================================");
        //只有有下标的集合才能使用下标进行遍历
        //使用下标进行遍历
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

        System.out.println("======================================");
        //使用foreach遍历
        for (String s:strList) {
            System.out.println(s);
        }

    }

}
