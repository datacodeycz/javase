package com.yuan.oop.demo01;

//引用传递：对象进行 本质还是值传递
public class Test05 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name); //null
        change(person);
        System.out.println(person.name);//袁成志

    }
    public static void change(Person person){
        person.name ="袁成志";
    }

}
//定义了一个Perosn类 类中有一个name属性
class Person{
    String name;
}
/*
这里是改变的perosn类中的name；
在change方法中形参类型为Perosn时
改变的是perosn中name的值
然后调用后 Perosn中name的值发生了改变
在main方法中 调用该类 最终输出结果为袁成志
 */