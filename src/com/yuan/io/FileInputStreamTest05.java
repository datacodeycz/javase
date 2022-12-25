package com.yuan.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileInputStream的一些其它常用方法：
    int available() :返回流当中剩余的没有读到的字节数量
    long skip(long n) : 跳过几个字节不读
 */
public class FileInputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/com/yuan/io/temp1");

            System.out.println("总字节数量：" + fis.available());

            //读一个字节
            //int readByte = fis.read();
            //System.out.println("剩下多少个字节没有读：" + fis.available());

            byte[] bytes = new byte[fis.available()];//这种方式不太适合太大的文件，因为byte[]数组有限

            //不需要循环了
            //直接读一次就行了
            //int dataCount = fis.read(bytes);
            //System.out.println(dataCount);
            //System.out.println(new String(bytes,0,dataCount));

            //跳过几个字节
            fis.skip(3);
            System.out.println(fis.read());//100


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
