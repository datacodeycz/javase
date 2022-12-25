package com.yuan.io;

import java.io.File;
import java.io.IOException;

/*
File:
    1、File类和四大家族没有关系，所以File类不能完成文件的读和写。
    2、File对象代表什么？
        文件和目录路径的抽象表示形式
        D:\考研内容\专业课\编程语言\Java\JavaSE\笔记\temp1 这是一个File对象

        一个File对象有可能对应的是目录，也有可能是文件。
        File只是一个路径名的抽象表达形式。
    3、需要掌握File类中的常用的方法
*/
public class FileTest01 {
    public static void main(String[] args) {
        //创建了一个File对象
        File f1 = new File("D:\\考研内容\\专业课\\编程语言\\Java\\JavaSE\\笔记\\temp1");

        //判断是否存在！
        //f1.exists();
        System.out.println(f1.exists());

        //如果不存再就新建一个文件
        if(!f1.exists()){
            try {
                f1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //如果不存在就新建一个目录
      /*  if(!f1.exists()){
            f1.mkdir();
        }*/
        //如果不存再就新建一个多重目录
        //以多重目录的形式新建
        File f2 =new File("D:\\考研内容\\专业课\\编程语言\\Java\\JavaSE\\a\\b\\c\\d");
        if (!f2.exists()){
            f2.mkdirs();
        }

        //
        File f3 = new File("D:\\考研内容\\专业课\\编程语言\\Java\\JavaSE");
        //获取文件的父类路径
        //f3.getParent()
        String parent = f3.getParent();
        System.out.println(parent);//D:\考研内容\专业课\编程语言\Java
        File parentF = f3.getParentFile();//还可以转换为File类型

        System.out.println("绝对路径：" + parentF.getAbsolutePath());//绝对路径：D:\考研内容\专业课\编程语言\Java

        //f4.getAbsolutePath() 获取绝对路径
        File f4 = new File("src/com/yuan/io/CopyTest01.java");
        System.out.println("CopyTest01.java的绝对路径为：" + f4.getAbsolutePath());//CopyTest01.java的绝对路径为：E:\code_data\java\java01\src\com\yuan\io\CopyTest01.java



    }
}
