package com.yuan.Thread;

//匿名内部类实现多线程
public class TestThread04 {
    public static void main(String[] args) {
        //创建线程对象，采用内部类的方法
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("分支线程"+i);
                }
            }
        });

        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程"+i);
        }

    }
}
