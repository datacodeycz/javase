package com.yuan.oop.demo03;

//封装

//学生类  private:私有
public class Student {
    private String  name;//名字
    private int age;//年龄
    private String id;//学号
    private char sex;//性别

    //提供一些可以操作这些属性的方法
    //提供一些public 的set和get的方法

    //set：设置这个数据
    //get；获得这个数据

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>150||age<0){
            System.out.println("年龄错误！");
        }else{
        this.age = age;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
/*
package com.yuan.oop.demo03;



1.t提高程序的安全性，保护数据
2.隐藏代码实现细节
3.统一接口
4.系统可维护增加了

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
 */
