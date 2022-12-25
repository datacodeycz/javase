package com.yuan.Thread;

/*
线程合并
 */
public class TestThread13 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable7());
        System.out.println("main开始");
        thread.setName("ycz");
        thread.start();

        //合并线程
        try {
            thread.join();//thread合并到当前线程，当前线程受阻，等thread结束
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
        System.out.println("main结束");
    }
}
class MyRunnable7 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <10000 ; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}