package com.yuan.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
关于集合遍历/迭代专题。（重点：五颗星****）
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        //注意：以下讲解的遍历方式/迭代方式，是所有Collection通用的一种方式。
        //在Map集合中下能用。在所有的Collection以及子类中使用。
        //创建集合对象
        Collection collection = new ArrayList();//后面的集合无所谓，主要是看前面的Collection接口，怎么遍历/迭代。

        //添加元素
        collection.add("ycz");
        collection.add("123");
        collection.add(2);
        collection.add(new Object());
        //对集合Collection进行遍历/迭代
        //第一步：获取集合对象的迭代器Iterator
        Iterator iterator = collection.iterator();
        //第二步：通过以上获取的迭代器对象开始迭代/遍历集合。
        /*
            以下两个方法是迭代器对象Iterator中的方法：
                Boolean hasNext()如果仍有元素可以迭代，则返回true。
                Object next()返回迭代的下一个元素
         */

        //迭代
        while(iterator.hasNext()){
            Object object = iterator.next();
            System.out.println(object);

        }

//        boolean hasNext = iterator.hasNext();
//        System.out.println(hasNext);
//        if(hasNext){
//            //不管你当初存进去什么，取出来统一都是Object。
//            Object object = iterator.next();
//            System.out.println(object);
//        }
//
//
//        System.out.println(hasNext);
//        if(hasNext){
//            //不管你当初存进去什么，取出来统一都是Object。
//            Object object = iterator.next();
//            System.out.println(object);
//        }
//
//        System.out.println(hasNext);
//        if(hasNext){
//            //不管你当初存进去什么，取出来统一都是Object。
//            Object object = iterator.next();
//            System.out.println(object);
//        }
//
//        if(hasNext){
//            //不管你当初存进去什么，取出来统一都是Object。
//            Object object = iterator.next();
//            System.out.println(object);
//        }
//

    }
}
