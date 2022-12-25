package com.yuan.oop.demo04;

//继承
//人 类 ：为父类
public class Person {
    public Person() {
        System.out.println("Person无参执行了");
    }

    protected String name ="yuan";
    //私有的无法继承！
    public void print(){
        System.out.println("Person");
    }

}
/*
测试类
package com.yuan.oop.demo04;

public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.test("zhi");
        s1.test1();

}
}
 */


/*
学生类
package com.yuan.oop.demo04;

//学生 is a 人（Person） ：为子类 可继承父类除private的所有方法和属性
public class Student extends Person{
    public Student() {
        super();//调用父类的构造器必须要第一排
        //super();这里隐藏了一个super（）调用了父类的无参构造

        当父类没有无参构造时（即直接写有参）
        子类也无法构造无参变量

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
 */
/*
知识点：
super注意点：
1.super调用父类的构造方法，必须在构造方法的第一个
2.super必须只能出现在子类的方法或者构造方法中
3.super跟this不能同时调用构造方法！
VS this：
      代表的对象不同
      this：本身调用者这个的对象
      super：代表父类对象的引用

      前提：
           this：没有继承也可以使用
           super：只能在继承条件下使用

      构造方法：
      this()：本类的构造
      super()：父类的构造

 */
