package com.yuan.oop.demo02;

//动物类
public class Pet {

    public String name;
    public int age;

    //无参构造

    public Pet() {

    }
    public void shout(String name){
        System.out.println(name+"叫了一声");
    }
}
   /*
    public static void main(String[] args) {
        Pet dog = new Pet();
        dog.name = "于士川";
        dog.age = 3;

        System.out.println(dog.name);
        System.out.println(dog.age);
        dog.shout(dog.name);

        Pet cat = new Pet();
        cat.name = "余俊秋";
        cat.age = 3;
        System.out.println(cat.name);
        System.out.println(cat.age);
    }
    */

