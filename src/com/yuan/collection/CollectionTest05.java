package com.yuan.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/*
测试contains()方法
测试remove()方法
结论：存放在一个集合中的类型，一定要重写equals方法
 */
public class CollectionTest05 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();

        User s1 = new User("jack");
        User s2 = new User("jack");

        collection.add(s1);
        //没有重写equals之前：这个结果是false
//        System.out.println(collection.contains(s2));//false
        //重写equals方法之后，比较的时候会比较name
        //contains方法会自动调用equals方法
        System.out.println(collection.contains(s2));//true

//        Integer x = new Integer(10000);
//
//        Integer y = new Integer(10000);
//        collection.add(x);
//        System.out.println(collection.contains(y));
//

        /*
        remove()方法：
                在使用remove方法时会自动调用equals方法
                当添加的元素值相等时（地址不同） remove(x2)方法会将与x2相等的元素删除（值相等，在remove看来是一个元素）
         */
        //创建集合对象
        Collection collection1 = new ArrayList();
        //创建字符串对象
        String x1 = new String("hello");
        String x2 = new String("hello");
        //添加到collection1集合中去
        collection1.add(x1);
        //删除collection1集合中的x2
        collection1.remove(x2);
        //输出集合中元素个数
      System.out.println(collection1.size());
    }

}
class User{
    private String name;

    public User(){};

    public User(String name){
        this.name = name;
    }

    //重写equals方法
    //将来调用equals方法的时候，一定是调用这个重写的equals方法。
    //这个equals方法的比较原理是：只要姓名一样就表示同一个用户。
    @Override
    public boolean equals(Object o) {
        if ( o == null || !(o instanceof User)) return false;
        if ( o == this ) return false;
        User user = (User) o;
        //如果名字一样表示同一个人。（不再比较对象的内存地址了。比较内容。）
        return Objects.equals(name, user.name);
    }

}