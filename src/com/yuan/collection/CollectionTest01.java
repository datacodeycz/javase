package com.yuan.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
关于java.util.Collection接口中常用的方法。
    1.Collection中能存放什么元素？
        没有使用“泛型”之前，Collection 中可以存储Object的所有子类型。
        使用了“泛型”之后。Collection中只能存储某个具体的类型。
        Collection中什么都能存，只要是Object的子类型就行。（集合中不能
        直接存储基本数据类型，也不能存储java对象，只是存储java对象的内存地址。）
    2.Collection中的常用方法
        boolean add(Object e)向集合中添加元素
        int size()//获取集合中元素的个数
        void clear()//清空集合
        boolean contain(object o) 判断当前集合中是否包含元素o，包含返回true 不包含返回false
        boolean remove(object o) 删除集合中的某个元素。
        boolean isEmpty() 判断该集合中元素的个数是否为空。
        object[] toArray() 调用这个方法可以把集合转换为数组。
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        //创建一个集合对象
        //Collection collection = new Collection();//接口是抽象的，无法实例化
        //多态
        Collection  collection = new ArrayList();
        //测试Collection接口中的常用方法
        collection.add(1200);//自动装箱（java5的新特性。），实际上是放进去了一个对象的内存地址。
        collection.add(3.14);//自动装箱
        collection.add(new Object());
        collection.add(new Student1());

        System.out.println("集合的元素的个数为" + collection.size());
        //清空集合中的元素
        collection.clear();
        System.out.println("集合的元素的个数为" + collection.size());

        //添加元素
        collection.add("Hello");
        collection.add("World");
        collection.add("ycz");
        collection.add("tb");
        collection.add(1);

        System.out.println("集合中元素的个数为" + collection.size());

        //判断集合中是否存在该元素
        System.out.println(collection.contains("ycz"));//true
        System.out.println(collection.contains(2));//false

        //删除集合中的元素
        collection.remove(1);

        System.out.println("集合中元素的个数为：" + collection.size());

        //判断集合是否为空，如果为空返回true 不为空返回false。
        System.out.println(collection.isEmpty());

        collection.clear();
        System.out.println(collection.isEmpty());

        collection.add("ycz");
        collection.add("123");
        collection.add("abc");
        collection.add("def");
        collection.add(2);

        //转换为数组
        Object[] objects = collection.toArray();
        for (int i = 0; i <objects.length ; i++) {
            //遍历数组
            Object object = objects[i];
            System.out.println(object);

        }
    }
}
class Student1{

}