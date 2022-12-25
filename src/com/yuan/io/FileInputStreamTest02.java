package com.yuan.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
上一次程序读取数据的改进
这个程序的缺点：
    一次读取一个字节byte，这样内存和硬盘交互太频繁，基本上时间/资源
    都耗费在交互上面了。能不能一次读取多个字节呢 —— >可以
 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null ;
        try {
            fis = new FileInputStream("E:\\考研内容\\专业课\\编程语言\\Java\\JavaSE\\IO_temp\\temp");

            /*while(true){
                int readData = fis.read();
                if(readData == -1)
                {
                    break;
                }else{
                    System.out.println(readData);
                }
            }*/
            //一般情况这样写循环
            int readData = fis.read();
            while((readData = fis.read()) != -1){
                System.out.println(readData);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
