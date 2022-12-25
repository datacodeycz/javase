package com.yuan.io;

import java.io.*;

/*
BufferedWriter:带有缓冲的字符输出流。
OutputStreamWriter：转换流
 */
public class BufferedWriteTest01 {
    public static void main(String[] args) {
        FileWriter out = null;
        BufferedWriter bw = null;
        try {
            //带有缓冲区的字符输出流
            /*out = new FileWriter("src/com/yuan/io/temp4",true);
            bw = new BufferedWriter(out);*/

            bw = new BufferedWriter(new OutputStreamWriter( new FileOutputStream("src/com/yuan/io/temp4",true)));

            bw.write("Hello World!");
            bw.write("\n");
            bw.write("ycz");


            //刷新
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }


    }
}
