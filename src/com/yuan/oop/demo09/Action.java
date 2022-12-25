package com.yuan.oop.demo09;

//abstract  抽象类 ： 类 extends： 单继承
public abstract class Action {


    //约束~ 有人帮我们实现的（就是子类必须重写方法）
    public abstract void doSomething();

    //1.不能new这个抽象类，只能靠子类去实现：约束！
    //2. 抽象类中可以写普通的方法~
    //3. 抽象方法必须在抽象类中~

}
