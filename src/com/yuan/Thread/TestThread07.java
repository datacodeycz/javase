package com.yuan.Thread;


/*
关于Thread.sleep();面试题：
 */
public class TestThread07 {
    public static void main(String[] args) {
        Thread myThread3 = new MyThread3();

        myThread3.setName("ycz");
        myThread3.start();

        try {
            //问题：myThread3.sleep();让分支线程睡眠吗？
            //答：不会
            //在执行的时候还是会转换成：Thread.sleep(1000);
            //这行代码的作用是：让当前线程进入休眠，也就是说main线程进入休眠
            //这样代码出现在main方法中，main线程睡眠

            myThread3.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello");

    }
}
class MyThread3 extends Thread{
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-->" + i);

        }
    }
}