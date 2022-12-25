package com.yuan.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
JDk8之后，推出了：自动类型推断机制（又称砖石表达式）
 */
public class GenericTest02 {
    public static void main(String[] args) {
        // List<Animal> myList = new ArrayList<这里可以自动推断>();前提是jdk8之后才允许
        //自动类型推断，砖石表达式！
        //创建ArrayList集合
        List<Animal> myList = new ArrayList<>();

        //创建添加的对象
        Cat cat = new Cat();
        Bird bird = new Bird();

        //遍历集合
        Iterator<Animal> iterator = myList.iterator();

        while(iterator.hasNext()){
            Animal animal = iterator.next();
            animal.move();
        }

        List<String> stringList = new ArrayList<>();

        stringList.add("https://www.baidu.com");
        stringList.add("https://www.qq.com");
        stringList.add("https://www.bilibili.com/");

        Iterator<String> iterator1 = stringList.iterator();
        while(iterator1.hasNext()){
            //直接通过迭代器获取了String类型的数据
            String string = iterator1.next();
            //直接调用String类的substring方法截取字符串
            String newString = string.substring(7);
            System.out.println(newString);

        }


    }
}
