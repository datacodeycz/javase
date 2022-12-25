package com.yuan.collection;

import java.util.*;

/*
java.util.Collection 集合接口
java.util.Collections 集合工具类，方便集合的操作。
 */
public class CollectionsTest {
    public static void main(String[] args) {

        //ArrayList集合不是线程安全的
        List<String> list = new ArrayList<>();

        //变成线程安全的
        Collections.synchronizedList(list);

        list.add("ycz");
        list.add("ycz1");
        list.add("ycz2");
        list.add("ycz3");
        //排序
        Collections.sort(list);


        //list集合遍历
        for (String l  : list){
            System.out.println(l);
        }
        System.out.println("==================");
        //Set集合怎么排序
        Set<String>  set = new HashSet<>();

        //Collections.sort()只能排序List集合
        //Collections.sort(set);

        //添加元素
        set.add("ycz1");
        set.add("ycz2");
        set.add("ycz3");
        set.add("ycz5");
        set.add("ycz4");

        //将Set集合转换成List集合
        List<String> list1 = new ArrayList<>(set);
        Collections.sort(list1);
        for (String li : list1){
            System.out.println(li);
        }
        System.out.println("====================");


        //Collections.sort(List集合,比较器对象);
        List<WuGui1> wuGui1s = new ArrayList<>();

        wuGui1s.add(new WuGui1(10000));
        wuGui1s.add(new WuGui1(20000));
        wuGui1s.add(new WuGui1(1000));
        //排序
        Collections.sort(wuGui1s);
        //遍历
        for (WuGui1 wg : wuGui1s){
            System.out.println(wg);
        }


    }
}
class WuGui1 implements Comparable<WuGui1>{
    int age;

    public WuGui1(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "WuGui1{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(WuGui1 o) {
        return this.age - o.age;
    }
}