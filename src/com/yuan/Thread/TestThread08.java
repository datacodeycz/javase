package com.yuan.Thread;
/*
sleep睡眠太久了，如果希望半道上醒来，你应该怎么办？ 怎么叫醒一个正在睡眠的线程？

thread.interrupt()干扰
 */
public class TestThread08 {
    public static void main(String[] args) {

        Thread thread = new Thread(new MyRunnable2());

        thread.setName("ycz");
        thread.start();

        //希望5秒之后，t线程醒来（5秒后主线程手里的活干完了）
        try {
            thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终断thread线程的睡眠（这种终断睡眠的方式依靠了java的异常处理机制）
        thread.interrupt();//干扰
    }
}
class MyRunnable2 implements Runnable{

    //重点：run()当中的异常不能throws，只能try catch
    //因为run()方法在父类中没有抛出任何异常，子类不能比父类抛出更多的异常

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"begin");
        try {
            //睡眠一年
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            //打印异常信息
            e.printStackTrace();
        }
        //正常情况下，一年后才会执行这里
        System.out.println(Thread.currentThread().getName()+"ben");
    }
}