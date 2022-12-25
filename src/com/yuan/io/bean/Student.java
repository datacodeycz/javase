package com.yuan.io.bean;

import java.io.Serializable;

public class Student implements Serializable {
    private int no;
    private String name;
    //java虚拟机看到Serializable接口之后，会自动生成一个序列化版本号。
    //这里没有手动写出来，java虚拟机会默认提供这个序列化版本号。
    //建议将序列版本号手动的写出来。不建议自动生成
    private static final long serialVersionUID = 1L;//java虚拟机识别一个类的时候先通过类名，如果类名一致
    private int age;
    private String email;
    public Student() {

    }


    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
