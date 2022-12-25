package com.yuan.reflect.reflect;

import java.util.Date;

// 在java.lang.reflect包下
public class ReflectTest01 {
    /*

    Class.forName()
        1.静态方法
        2.方法的参数是一个字符串
        3.字符串需要的是一个完整类名
        4.完整类名必须带有包名。java.lang包也不能省略

        第一种方法: Class c1 = Class.forName();
        第二种方法: Class c2 = 对象.getClass();
        第三种方法： Class c3 = 任何类型.class;
     */
    public static void main(String[] args) {
        Class c1 = null;
        Class c2 = null;
        try {
            c1 = Class.forName("java.lang.String"); // c1代表String.class文件
            c2 = Class.forName("java.util.Date"); // c2代表Date类型
            Class c3 = Class.forName("java.lang.Integer"); //c3代表Integer类型
            Class c4 = Class.forName("java.lang.System"); // c4代表System类型

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // 获取class文件的第二种方法
        // java中任意一个对象都要一个方法.getClass()
        String s = "ycz";
        Class s1 = s.getClass();
        System.out.println(s1 == c1); //true  ==表示判断内存中保存的地址

        Date date = new Date();
        Class date1 = date.getClass();
        System.out.println(date1 == c2); //true


        //任何一个类型都有一个属性 就是.Class
        Class k = Date.class;
        Class a = String.class;
        Class b = int.class;
        System.out.println(b); // 代表int类型 输出int
    }
}
