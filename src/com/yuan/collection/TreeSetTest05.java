package com.yuan.collection;

import java.util.TreeSet;

/*
写一写 比较规则
 */
public class TreeSetTest05 {
    public static void main(String[] args) {

        TreeSet<Vip> vipTreeSet = new TreeSet<>();

        Vip v1 = new Vip(21,"ycz");
        Vip v2 = new Vip(25,"zhi");
        Vip v3 = new Vip(21,"yuan");
        Vip v4 = new Vip(29,"cheng");

        vipTreeSet.add(v1);
        vipTreeSet.add(v2);
        vipTreeSet.add(v3);
        vipTreeSet.add(v4);

        for(Vip v : vipTreeSet){
            System.out.println(v);
        }
    }
}
class Vip implements Comparable<Vip> {
    int age;
    String name;

    public Vip(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Vip v) {
        if (v.age == this.age) {
            this.name.compareTo(v.name);
        } else {
            return this.age - v.age;
        }
        return 0;
    }


}
