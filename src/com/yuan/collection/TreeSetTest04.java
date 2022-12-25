package com.yuan.collection;

import java.util.TreeSet;

/*
实现自定义类型TreeSet排序
 */
public class TreeSetTest04 {
    public static void main(String[] args) {
        //创建TreeSet集合
        TreeSet<Customers> customers = new TreeSet<>();

        Customers s1 = new Customers(32);
        Customers s2 = new Customers(28);
        Customers s3 = new Customers(19);
        Customers s4 = new Customers(20);
        Customers s5 = new Customers(40);
        Customers s6 = new Customers(23);
        //添加元素
        customers.add(s1);
        customers.add(s2);
        customers.add(s3);
        customers.add(s4);
        customers.add(s5);
        customers.add(s6);
        for (Customers c : customers){
            System.out.println(c);
        }

    }
}
class Customers implements Comparable<Customers>{
    int age;
    public Customers(int age){
        this.age = age;
    }

    //需要在这个方法中编写比较的逻辑，或者说比较的规则，按照什么进行比较！
    //k.compareTo(t.key)
    //拿着参数k和集合中的每一个k进行比较，返回值可能是 >0 <0 =0
    //比较规则最终还是由程序员指定的： 例如按照年龄升序。或者是按照年龄降序。
    public int compareTo(Customers c) {
        return this.age - c.age;
    }
    public String toString(){
        return "Customer[age = " + age + "]";
    }

}
