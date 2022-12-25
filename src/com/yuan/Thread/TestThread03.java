package com.yuan.Thread;

/*
建议使用
多线程的第二种表示方法
通过编写一个类实现java.lang.Runnable接口
 */
public class TestThread03 {
    public static void main(String[] args) {

        //创建一个可运行的对象
//        MyRunnable myRunnable = new MyRunnable();

        //将可运行对象封装成多线程对象
//        Thread thread = new Thread(myRunnable);

        Thread thread = new Thread(new MyRunnable());//合并代码
        //启动线程
        thread.start();
        for (int i = 0; i < 200; i++) {
            System.out.println("主线程————>"+i);
        }


    }
}
//只是一个可运行的类
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("分支线程————>"+i);
        }

    }
}