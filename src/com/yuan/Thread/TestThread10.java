package com.yuan.Thread;

/*
创建一个较为合理的关闭线程的方法：
  通过在MyRunnable中加一个变量类型为布尔值
  当需要关闭时，将变量改为false 即可在else{}中保存数据 并关闭线程
 */
public class TestThread10 {
    public static void main(String[] args) {
        MyRunnable4 myRunnable4 = new MyRunnable4();
        Thread thread = new Thread(myRunnable4);

        thread.setName("ycz");
        thread.start();
        //模拟4秒后
        try {
            Thread.sleep(1000*4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //想多久关闭就多久设值
        myRunnable4.run = false;
    }
}
class MyRunnable4 implements Runnable{

    boolean run = true;
    @Override
    public void run() {

            for (int i = 0; i < 100; i++) {
                if (run){
                System.out.println(Thread.currentThread().getName()+"-->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
                else{
                    //终止当前线程
                    //数据即可从这开始保存

                    return;
                }
        }

    }
}