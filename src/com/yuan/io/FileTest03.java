package com.yuan.io;

import java.io.File;
/*
File中listFiles()方法
    可以获得该路径下的所有子路径 所以是一个File[] 数组类型的
 */
public class FileTest03 {
    public static void main(String[] args) {
        File f1 = new File("D:\\考研内容\\专业课\\编程语言\\Java\\JavaSE\\笔记");

        File[] files = f1.listFiles();
        //用增强for进行遍历
        for(File file : files){
            System.out.println(file.getAbsolutePath());
        }
    }
}
