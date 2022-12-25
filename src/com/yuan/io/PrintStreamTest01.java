package com.yuan.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest01 {
    public static void main(String[] args) {


        System.out.println("Hello World");

        PrintStream ps = System.out;
        ps.println("Hello World");
        ps.println("ycz1");
        ps.println("ycz2");
        ps.println("ycz3");
        //标准输出流不需要手动close()关闭。
        //可以改变标准输出流的输出方向吗？ 可以
        /*
        以下是System类常用的方法和属性。
        System.gc();
        System.currentTimeMillis();
        PrintStream ps2 = System.out;
        System.exit(0);
        System.arraycopy(……);
         */

        try {
            //标准输出流不再指向控制台，指向"log"文件
            PrintStream ps1 = new PrintStream( new FileOutputStream("src/com/yuan/io/log"),true);
            //修改输出方向，将输出方向修改到“log”文件
            System.setOut(ps1);
            //再输出
            System.out.println("Hello World");
            System.out.println("Hello wd");
            System.out.println("Hello ycz");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
