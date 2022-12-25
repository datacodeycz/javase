package com.yuan.collection;


import java.util.Comparator;
import java.util.TreeSet;

/*
TreeSet集合中元素可排序的第二种方式：使用比较器的方式。
最终的结论：
    放到TreeSet或者TreeMap集合key部分的元素要想做到排序，包括两种方式：
        第一种：放在集合中的元素实现java.lang.Comparable接口。
        第二种：在构造TreeSet或者TreeMap集合的时候给它传一个比较对象。
    comparable和comparator怎么选择呢？
        当比较规则不会发生改变的时候，或者说当比较规则只有1个的时候，建议实现Comparable接口。
        如果比较规则有多个，并且需要多个比较规则之间频繁切换，建议使用Comparator接口。

 */
public class TreeSetTest06 {
    public static void main(String[] args) {

        //创建TreeSet集合的时候，需要使用这个比较器。
        //TreeSet<WuGui> wuGuis = new TreeSet<>();//这样不行，没有通过构造方法传递一个比较器
        //给构造方法传递一个比较器。
        //TreeSet<WuGui> wuGuis = new TreeSet<>(new WuGuiComparator());
        //可以使用匿名内部类的方式（这个类没有名字。直接new接口。）
        TreeSet<WuGui> wuGuis = new TreeSet<>(new Comparator<WuGui>() {
            @Override
            public int compare(WuGui o1, WuGui o2) {
                return o1.age - o2.age;
            }
        });

        WuGui w1 = new WuGui(10000);
        WuGui w2 = new WuGui(1000);
        WuGui w3 = new WuGui(20000);
        WuGui w4 = new WuGui(30000);
        WuGui w5 = new WuGui(40000);

        //添加元素
        wuGuis.add(w1);
        wuGuis.add(w2);
        wuGuis.add(w3);
        wuGuis.add(w4);
        wuGuis.add(w5);

        for (WuGui wuGui : wuGuis){
            System.out.println(wuGui);
        }



    }
}
//乌龟类
class WuGui{
    int age;

    public WuGui(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "WuGui{" +
                "age=" + age +
                '}';
    }
}

//单独在这里编写一共比较器
//比较器实现java.util.Comparator接口。
class WuGuiComparator implements Comparator<WuGui>{

    @Override
    public int compare(WuGui o1, WuGui o2) {
        return o1.age - o2.age;
    }
}

