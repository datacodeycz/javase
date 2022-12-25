package com.yuan.exception.demo01;

public class Test03 {
    public static void main(String[] args) {

        try {
            new Test03().test(1,0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }

    //假设这个方法中，处理不了这个异常，则方法上抛出异常
    void test(int a,int b) throws ArithmeticException{
        if(b==0){ //throw
            throw new ArithmeticException();//主动抛出异常 ，一般在方法中使用
        }
    }
}
