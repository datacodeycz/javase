package com.yuan.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map的遍历***非常重要
 */
public class MapTest02 {
    public static void main(String[] args) {
        //方式1：通过key遍历获取value遍历，从而达到遍历
        //创建一个Map集合对象
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"yuan");
        map.put(2,"tang");
        map.put(3,"bing");
        map.put(4,"zhi");
        map.put(5,"cheng");

        //获取Map中的key
        Set<Integer> keys = map.keySet();

        //通过迭代器 遍历key 通过key获取value
        Iterator<Integer> iterator = keys.iterator();
        while(iterator.hasNext()){
            //获取key
            Integer key = iterator.next();
            //通过key获取Map中对应的value
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("================================");
        //通过增强for循环
        for( Integer key : keys){
            System.out.println(key + "=" + map.get(key));
        }

        System.out.println("================================");
        //方式二  通过Map.entrySet()方法进行遍历;
        //这种方式效率比较高，因为获取key和value都是直接从node对象中获取的属性值。
        //这种方式比较适合于大数据量。

        //Map.entry为一个正常的内部类 在使用时直接用类使用的方法即可
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        //使用迭代器的方法
        Iterator<Map.Entry<Integer, String>> iterator1 = entries.iterator();

        while(iterator1.hasNext()){
            Map.Entry<Integer,String> node = iterator1.next();
            String value = node.getValue();
            Integer key = node.getKey();
            System.out.println(key + "=" + value);
        }
        System.out.println("================================");
        //foreach方法
        for(Map.Entry<Integer,String> node : entries){
            System.out.println(node.getKey() + "=" + node.getValue());
        }

    }
}
