package com.yuan.exception.demo02;

public class MyException extends Exception{

    private int detai1;

    public MyException(int a) {
        this.detai1 = a;
    }

    @Override
    public String toString() {
        return "MyException{" + detai1 + '}';
    }
}
