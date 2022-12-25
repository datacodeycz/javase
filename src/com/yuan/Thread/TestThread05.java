package com.yuan.Thread;

/*
1.怎么获取当前线程对象？
   Thread t = Thread.currentThread();
2.获取线程对象的名字
   String name = 线程对象.getName();

3.修改线程对象的名字
   线程对象.setName("线程名字")

4.当线程没用设置名字的时候，默认的名字的规律
   Thread-0
   Thread-1
   Thread-2
   Thread-3

 */
public class TestThread05 {
    public static void main(String[] args) {
        //创建线程对象
        MyThread2 myThread2 = new MyThread2();
        //设置线程名字
        myThread2.setName("sss");

        //获取线程名字
        String thread2Name = myThread2.getName();
        System.out.println(thread2Name);

        //获取当前线程的对象
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread);
        //开启线程
        myThread2.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程-->" + i);
        }
    }
}
class MyThread2 extends Thread{

    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("分支线程———>" + i);
        }
    }

    }