package com.yuan.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
File的常用方法
 */
public class FileTest02 {
    public static void main(String[] args) {
        File f1 = new File("D:\\考研内容\\专业课\\编程语言\\Java\\JavaSE\\笔记\\JAVASE多线程.md");

        //获取文件的名字
        String s = f1.getName();
        System.out.println(s);

        //判断是否是目录
        System.out.println(f1.isDirectory());//false

        //判断是否是文件
        System.out.println(f1.isFile());//true

        //获取文件最后一次修改的时间
        long hao = f1.lastModified();//这个毫秒是从1970年到现在的总毫秒数
        //将总毫秒数转换为日期
        Date time = new Date(hao);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String StrTime = sdf.format(time);
        System.out.println(StrTime);

        //获取文件大小
        System.out.println(f1.length());

    }
}
