package com.yuan.Thread;

/*
在java中怎么强行终止一个线程的执行。
    这种方式存在很大的缺点：
                        容易丢失数据。因为这种方式是直接将线程杀死了
                        线程没有保存的数据将会丢失，不建议使用
 */

public class TestThread09 {
    public static void main(String[] args) {
        Thread thread = new Thread( new MyRunnable3());

        //设置线程名字
        thread.setName("ycz");
        //开启线程
        thread.start();

        //5秒后thread线程强行终止
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.stop();//已过时（不建议使用）

    }
}
class MyRunnable3 implements Runnable{

    @Override
    public void run() {
        for (int i = 0;i < 10; i++){
            System.out.println(Thread.currentThread().getName()+"-->" + i);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}