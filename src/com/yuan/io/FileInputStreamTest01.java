package com.yuan.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
java.io.FileInputStream:
    1、文件字节输入流，万能的，任何类型得文件都可以采用这个流来读
    2、字节得方式，完成输入得操作，完成读得操作（硬盘-->内存）
 */
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        {
            try {
                //创建文件字节输入流对象
                //文件路径：D:\考研内容\专业课\编程语言\Java\JavaSE\IO_temp\temp（IDEA会自动把\变成\\，因为java中\表示转义）
                //写成这样也是可以的
                //以下都是采用了：绝对路径的方式。
                // fis = new FileInputStream("D:/考研内容/专业课/编程语言/Java/JavaSE/IO_temp/temp")
                fis = new FileInputStream("D:\\考研内容\\专业课\\编程语言\\Java\\JavaSE\\IO_temp\\temp");
                //开始读
                int readData =fis.read();//这个方法的返回值是：读取到的“字节”本身
                System.out.println(readData);//97
                readData = fis.read();
                System.out.println(readData);//98
                readData = fis.read();
                System.out.println(readData);//99
                readData = fis.read();
                System.out.println(readData);//100
                readData = fis.read();
                System.out.println(readData);//101
                readData = fis.read();
                System.out.println(readData);//102
                //已经读到文件的末尾了，再读的时候读取不到任何数据，返回-1
                readData = fis.read();
                System.out.println(readData);//-1
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally{
                //在finally语句块当中确保一定关闭。
                if (fis != null) {
                    //关闭流的前提是：流不是空。流是null的时候没必要关闭
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                }
            }
        }
    }

