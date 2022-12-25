package com.yuan.collection.map;

import java.util.Hashtable;
import java.util.Map;

/*
Hashtable的key可以为null吗？
    Hashtable集合的key和value都是不能为null的。
    HashMap集合的key和value但是可以为null的。

Hashtable方法都带有synchronized;线程安全的。
线程安全有其它的方案，这个Hashtable对线程的处理
导致效率比较低，使用比较少了。

Hashtable和HashMap一样，底层都是哈希表数据结构
Hashtable的初始化容量是11，默认加载因子是：0.75f.
Hashtable的扩容是：原容量 *2 + 1

 */
public class HashtableTest01 {
    public static void main(String[] args) {

        Map map = new Hashtable();

        //map.put(null,100);

        map.put(100,null);

    }
}
