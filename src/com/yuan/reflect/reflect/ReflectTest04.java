package com.yuan.reflect.reflect;


// 若只需要静态代码块执行,则直接使用Class.forName()
public class ReflectTest04 {
    public static void main(String[] args) {
        try {
            Class.forName("com.yuan.reflect.reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    }