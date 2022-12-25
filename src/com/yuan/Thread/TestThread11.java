package com.yuan.Thread;

/*
线程的优先级
 */
public class TestThread11 {
    public static void main(String[] args) {
//        System.out.println("最高优先级" + Thread.MAX_PRIORITY);
//        System.out.println("默认优先级" + Thread.NORM_PRIORITY);
//        System.out.println("最低优先级" + Thread.MIN_PRIORITY);

        //设置main线程的优先级
        Thread.currentThread().setPriority(1);

        Thread thread = new Thread( new MyRunnable5());
        //设置thread线程的优先级

        //优先级较高的，只是抢到CPU时间片相对多一些
        //大概率方向更偏向于优先级比较高的
        thread.setPriority(10);
        thread.setName("ycz");
        thread.start();
        //获取main线程的默认优先级为5
        //获取当前线程的优先级Thread.currentThread().getPriority()
//        System.out.println(Thread.currentThread().getName() + "的默认优先级是" + Thread.currentThread().getPriority());
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}
class MyRunnable5 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i );
        }
    }

}