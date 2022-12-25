package com.yuan.oop.demo04;

//学生 is a 人（Person） ：为子类 可继承父类除private的所有方法和属性
public class Student extends Person{
    public Student() {
        super();//调用父类的构造器必须要第一排
        //super();这里隐藏了一个super（）调用了父类的无参构造
        /*
        当父类没有无参构造时（即直接写有参）
        子类也无法构造无参变量
         */
        System.out.println("Student无参执行了");
    }

    private String name = "cheng";
    public void print(){
        System.out.println("Student");
    }
    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    public void test1(){
        this.print();
        //print(); 只写print（）是本类的不是父类的
        super.print();

    }



}
