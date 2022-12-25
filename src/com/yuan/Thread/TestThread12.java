package com.yuan.Thread;

/*
让位，当前线程暂停，回到就绪状态，让给其他线程
静态方法：Thread.yield();
 */
public class TestThread12 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable6());
        thread.setName("ycz");
        thread.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }

    }
}
class MyRunnable6 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
            //每100次thread线程让位main线程
            if(i%100 ==0){
                Thread.yield();
            }
        }
    }
}