package com.yuan.collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
1、JDK5.0之后推出的新特性：泛型
2、泛型这种语法机制，只在程序编译阶段起作用，只是给编译器参考的。(运行阶段泛型没用！)
3、使用了泛型好处是什么？
    第一：集合中国存储的元素类型统一了。
    第二：从集合中取出的元素类型是泛型指定的类型，不需要进行大量的“向下转型”！

4、泛型的缺点是什么？
    导致集合中存储的元素缺乏多样性！
    大多数业务中，集合中元素的类型还是统一的。
 */
public class GenericTest01 {
    public static void main(String[] args) {
    // 不使用泛型
        /*
创建ArrayList集合
        List myList = new ArrayList();

        //创建对象
        Cat c = new Cat();
        Bird b = new Bird();

        //将对象添加到集合中
        myList.add(c);
        myList.add(b);

        //遍历集合，取出每个Animal，让它move
        Iterator iterator = myList.iterator();
        while(iterator.hasNext()){
            //通过迭代器取出的就是Object，并非其它类型
            Object object = iterator.next();

            if(object instanceof Animal){
                //object中没有move方法，无法调用，需要向下转型
                Animal animal = (Animal) object;
                animal.move();
            }
        }
*/
        //使用JDK5.0之后的泛型机制：
        //使用泛型List<Animal>之后，表示List集合中只允许存储Animal类型的数据
        //用泛型来指定集合中存储的数据类型
        List<Animal> myList = new ArrayList<Animal>();

        //创建需要添加的对象
        Cat cat = new Cat();
        Bird bird = new Bird();

        //指定List集合中只能存储Animal，那么存储String就编译报错了。
        //着用用了泛型之后，集合中元素的类型更加统一了。
        //myList.add("abc");

        //在集合中添加元素
        myList.add(cat);
        myList.add(bird);

        //遍历集合，让猫抓老鼠，让鸟飞翔

        //获取迭代器
        //这个迭代器迭代的是Animal类型
        Iterator<Animal> iterator = myList.iterator();

        while(iterator.hasNext()){
            //使用泛型之后，每一次迭代返回的数据都是Animal类型。
            //这里不需要进行强制类型转换了，直接调用。
            Animal animal = iterator.next();
            animal.move();

            //调用子类型特有的方法还是需要向下转换的！
            //让猫抓老鼠
            if(animal instanceof Cat){
                Cat cat1 = (Cat) animal;
                cat1.catchMouse();
            }
            if(animal instanceof Bird){
                Bird bird1 = (Bird) animal;
                bird1.fly();
            }
        }


    }
}
class Animal{
    //父类自带方法
    public void move(){
        System.out.println("动物在移动");
    }
}
class Cat extends Animal{
    //子类特有方法
    public void catchMouse(){
        System.out.println("猫抓老鼠！");
    }

}
class Bird extends Animal{
    //子类特有方法
    public void fly(){
        System.out.println("鸟在飞翔！");
    }
}