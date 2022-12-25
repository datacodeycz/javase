package com.yuan.collection.map;

import java.util.HashSet;
import java.util.Set;

/*
1、向Map集合中存，以及从Map集合中取，都是先调用key的hashCode方法，然后再调用equals方法！
equals方法有可能调用，也有可能不调用。
    拿put(k,v)举例，什么时候equals不会调用？
        k.hashCode()方法返回哈希值，
        哈希值经过哈希算法转换为数组下标。
        数组下标位置上如果是null，equals不需要执行。
    拿get(k)举例，什么是很好equals不回调用？
        k.hashCode()方法返回哈希值，
        哈希值经过哈希算法转换为数组下标。
        数组下标位置上如果是null，equals不需要执行。
2、注意：如果一个类的equals方法重写了，那么hashCode()方法必须重写。
并且equals方法返回如果是true，hashCode()方法返回的值必须一样。
    equals方法返回true表示两个对象相同；再同一单向链表上比较。
    那么对于同一个单向链表上的节点来说，他们的哈希值都是相同的。
    所有hashCode()方法的返回值也应该相同。
3、hashCode()方法和equals()方法可以用IDEA工具生成

4、结论：
    放在HashMap集合key部分的，以及放在HashSet集合中的元素，需要同时重写hashCode()方法和equals()方法。
5、对于哈希表数据结构来说：
    如果o1和o2的hash值相同，一定放到同一个单向链表上。
    当然如果o1和o2的hash值不同，但由于哈希算法执行结束之后转换的数组下标可能相同，此时会发生 "哈希碰撞"。
 */
public class HashMapTest02 {
    public static void main(String[] args) {

        Student s1 = new Student("张三");
        Student s2 = new Student("张三");

        //重写了equals方法，比较的是值 之前比较的是地址
        s1.equals(s2);//true

        System.out.println("s1的hashCode=" + s1.hashCode());//1163157884
        System.out.println("s2的hashCode=" + s2.hashCode());//1956725890

        //s1.equals(s2)结果已经是true了，表示s1和s2是一样的，那么往Hashset集合中放的话，
        //按理说只能放进去一个（HashSet集合特点：无序不可重复）
        Set<Student> set = new HashSet<>();

        set.add(s1);
        set.add(s2);

        System.out.println(set.size());//理论上是1;但实际结果是2

    }
}
