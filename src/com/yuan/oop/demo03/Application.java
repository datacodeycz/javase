package com.yuan.oop.demo03;


/*
1.t提高程序的安全性，保护数据
2.隐藏代码实现细节
3.统一接口
4.系统可维护增加了
 */
public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("ycz");
        s1.setAge(20);
        s1.setId("202001010395");
        s1.setSex('男');
        System.out.println(s1.getName());
        System.out.println(s1.getSex());
        System.out.println(s1.getAge());
        System.out.println(s1.getId());


    }
}
