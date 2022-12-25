package com.yuan.collection;

import java.util.HashSet;
import java.util.Set;

/*
HashSet集合特点：
    无序不可重复
 */
public class HashSetTest01 {
    public static void main(String[] args) {

        //演示HashSet集合
        Set<String> strs = new HashSet<>();
        //添加元素
        strs.add("ycz");
        strs.add("tb");
        strs.add("Hello");
        strs.add("Hello1");
        strs.add("Hello2");
        strs.add("Hello1");

        //遍历
        //存进去的顺序与输出的顺序不同
        //不可重复
        //放到HashSet集合中的元素实际是放到了HashMap集合的key部分了
        for(String s : strs){
            System.out.println(s);
        }



    }
}
