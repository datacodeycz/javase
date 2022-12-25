package com.yuan.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
java.util.Map接口中常用的方法：
    1、Map和Collection没有继承关系。
    2、Map集合以key和value的方式存储数据：键值对
        key和value都是引用数据类型。
        key和value都是存储对象的内存地址。
        key起到主导的地位，value是key的一个附属品。
    3、Map接口常用方法：
        V put(K key, V value)  向Map集合中添加键值对
        V get(Object key)  通过key获取value
        void clear() 清空Map集合
        boolean containsKey(Object key) 判断Map中是否包含某个key
        boolean containsValue(Object value) 判断Map中是否包含某个value
        boolean isEmpty()  判断Map集合中的元素个数是否为0
        Set<K> keySet()  获取Map集合所有的key（所有的键是一个set集合）
        V remove(Object key)  通过key删除键值对
        int size() 获取Map集合中键值对的个数。
        Collection<V> values() 获取Map集合中所有的value，返回一个Collection

        Set<Map.Entry<K,V>> entrySet()
            将Map集合转换成Set集合
            假设现在有一个Map集合，如下所示：
                map1集合对象
                key         value
               -----------------------
                1           ycz
                2           tb
                3           ysc
                4           zwy
                5           fxd

                Set set =map1.entrySet();
                1=ycz           【注意：Map集合通过entrySet()方法转换成的这个Set集合，Set集合中元素的类型是Map.Entry。
                2=tb            【Map.Entry和String一样，都是一种类型的名字，只不过：Map.Entry是静态内部类】
                3=ysc
                4=zwy
                5=fxd
 */
public class MapTest01 {
    public static void main(String[] args) {

        //创建Map集合对象
        Map<Integer,String> map = new HashMap<>();

        //向Map集合中添加键值对
        map.put(1,"ycz"); //1是自动装箱
        map.put(2,"tb");
        map.put(3,"ysc");
        map.put(4,"zwy");
        map.put(5,"fxd");

        //获取Map集合中键值对的个数
        System.out.println(map.size());

        //通过key获取value
        String value = map.get(2);
        System.out.println(value);

        //判断Map集合中是否包含key
        System.out.println(map.containsKey(1));//true

        //判断Map集合中是否包含value
        System.out.println(map.containsValue("ycz"));//true

        //获取Map中的key
        Set<Integer> key = map.keySet();

        //遍历Map中的key
        for(Integer s : key){
            System.out.println(s);
        }

        //获取Map中的Value
        Collection<String> value1 = map.values();

        //遍历Map中的Value
        for(String s : value1){
            System.out.println(s);
        }

        //通过key删除Map中的键值对
        map.remove(1);
        //重新获取Map集合中的键值对
        System.out.println(map.size());

        //清空Map集合中的键值对
        map.clear();
        System.out.println(map.size());

        //判断Map集合中的元素个数是否为0
        System.out.println(map.isEmpty());//true


    }
}
