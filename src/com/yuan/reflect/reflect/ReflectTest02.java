package com.yuan.reflect.reflect;

import com.yuan.reflect.bean.User;

// 通过反射机制创建实例化对象
public class ReflectTest02 {
    public static void main(String[] args) {

        // 这里是不适用反射机制的方式创建对象
        User user = new User();
        System.out.println(user);
        Class u = null;
            try {
                u = Class.forName("com.yuan.reflect.bean.User");
                // newInsatnce()这个方法会调用User这个类的午餐构造方法,完成对象的创建.
                // 重点是:newInstance()调用的是无参构造,必须保证无参构造是存在的! 这里最好写一下
                Object object = u.newInstance();
                System.out.println(object); //com.yuan.reflect.bean.User@4eec7777 这个对象
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }

    }



}
