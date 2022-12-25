package com.yuan.reflect.reflect;

/*
通过反射机制获取父类和实现的接口
 */
public class ReflectTest12 {
    public static void main(String[] args) throws Exception{
        // 用String举例
        Class stringClass = Class.forName("java.lang.String");
        System.out.println(stringClass.getName());
        // 获取String的父类 是个数组
        Class[] superClass = stringClass.getInterfaces();
        for (Class in : superClass){
            System.out.println(in.getName());
        }
        System.out.println("====================");

        // 获取String类实现的所有接口（一个类可以实现多个接口）
        Class[] interfaces = stringClass.getInterfaces();
        for(Class in : interfaces){
            System.out.println(in.getName());
        }
    }
}
