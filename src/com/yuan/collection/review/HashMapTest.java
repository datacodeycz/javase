package com.yuan.collection.review;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
HashMap
回顾：
        每个集合对象的创建（new）
        向集合中添加元素
        从集合中取出某个元素
        遍历集合
 */
public class HashMapTest {
    public static void main(String[] args) {
        //创建HashMap集合对象
        Map<Integer,String> map = new HashMap<>();

        //向集合中添加元素
        map.put(1,"ycz1");
        map.put(2,"ycz4");
        map.put(3,"ycz5");
        map.put(4,"ycz6");
        map.put(5,"ycz7");
        map.put(6,"ycz8");
        map.put(7,"ycz2");

        //从集合中取出元素
        //通过key取出value

        System.out.println(map.get(2));

        //遍历

        //通过取出key进行遍历
        Set<Integer> integers = map.keySet();
        for (Integer i : integers){
            String value = map.get(i);
            System.out.println(i + "==" + value);
        }

        //通过entrySet()方法进行遍历

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Map.Entry<Integer,String> m : entries){
            System.out.println(m.getKey() + "==" + m.getValue());
        }


    }
}
