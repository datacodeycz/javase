package com.yuan.Thread;


public class TestThread14 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable8());
        System.out.println("main方法开始");
        thread.setName("ycz1");
        thread.start();

        try {
            thread.join();
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
        System.out.println("main结束");


    }

}

class MyRunnable8 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <10000 ; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}