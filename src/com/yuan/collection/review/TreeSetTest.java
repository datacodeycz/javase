package com.yuan.collection.review;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
TreeSet
    回顾：
        每个集合对象的创建（new）
        向集合中添加元素
        从集合中取出某个元素
        遍历集合
        测试TreeSet集合的特点：无序不可重复 但按照大小顺序进行排序
        测试TreeSet集合在自定义类型时的遍历。
 */
public class TreeSetTest {
    public static void main(String[] args) {

        //创建TreeSet集合对象
        TreeSet<String> treeSet = new TreeSet<>();

        //向集合中添加元素
        treeSet.add("ycz1");
        treeSet.add("ycz12");
        treeSet.add("ycz11");
        treeSet.add("ycz1w");
        treeSet.add("ycz18");
        treeSet.add("ycz13");

        //遍历集合
        //通过迭代器进行遍历

        Iterator<String> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            String t = iterator.next();
            System.out.println(t);
        }

        //通过增强for循环进行遍历
        for (String t : treeSet){
            System.out.println(t);
        }

        //对自定义类型进行排序实现

        TreeSet<WuGui> tree = new TreeSet<>();

        tree.add(new WuGui(10000));
        tree.add(new WuGui(20000));
        tree.add(new WuGui(40000));
        tree.add(new WuGui(1000));
        tree.add(new WuGui(100));
        tree.add(new WuGui(100100));

        //遍历集合
        for (WuGui wuGui : tree){
            System.out.println(wuGui);
        }

        //通过Comparator接口进行自定义比大小
        TreeSet<WuGui1> tree1 = new TreeSet<>(new Comparator<WuGui1>() {
            @Override
            public int compare(WuGui1 o1, WuGui1 o2) {
                return o1.age - o2.age;
            }
        });

        tree1.add(new WuGui1(22000));
        tree1.add(new WuGui1(2000));
        tree1.add(new WuGui1(23000));
        tree1.add(new WuGui1(242000));
        tree1.add(new WuGui1(25000));
        tree1.add(new WuGui1(200));

        //遍历
        for (WuGui1 wuGui1 : tree1){
            System.out.println(wuGui1);
        }


    }
}
class WuGui implements Comparable<WuGui>{
    int age;

    public WuGui(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "WuGui{" +
                "age=" + age +
                '}';
    }


    @Override
    public int compareTo(WuGui o) {
        return this.age - o.age;
    }
}
class WuGui1 {
    int age;

    public WuGui1(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "WuGui1{" +
                "age=" + age +
                '}';
    }
}
