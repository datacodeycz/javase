package com.yuan.Thread;

/*
实现线程的第一种方式：
    编写一个类，直接继承java.lang.Thread,重写run()方法

    怎么启动线程对象？ -> new
    怎么启动线程？ 调用线程对象start()方法

注意：
    方法体中的代码永远都是自上而下的顺序执行的
 */
public class TestThread01 {
    public static void main(String[] args) {
        //这里是main方法，这里的代码属于主线程，在主栈中运行
        //新建一个分支线程对象
        MyThread myThread = new MyThread();


        //myThread.run();//不会启动分支线程 只会执行
        //启动线程
        //start()方法的作用是：启动一个分支线程，在JVM中开辟一个新的栈空间，这段代码的任务完成之后，瞬间就结束了。
        //这段代码的任务只是为了开启一个新的栈空间，只要新的栈空间开出来了，start()方法就结束了，线程就启动成功了。
        //启动成功的线程会自动调用run方法，并且run方法在分支栈的栈底部（压栈）。
        //run方法在分支栈的栈底部，main方法在主栈的栈底部。run和main是平级的。
        myThread.start();
        //这段代码还是运行在主栈里面的

        for (int i = 0; i < 200; i++) {
            System.out.println("主线程-->"+i);
        }


    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        //编写程序，运行在分支线程（分支栈中）
        for (int i = 0; i < 200; i++) {
            System.out.println("分支线程-->"+i);
        }

        }
    }
