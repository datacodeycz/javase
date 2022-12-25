package com.yuan.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
使用FileReader FileWriter 进行拷贝的话，只能拷贝“普通文本”文件
 */
public class CopyTest02 {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;

        try {
            //读
            in = new FileReader("src/com/yuan/io/CopyTest01.java");
            //写
            out = new FileWriter("src/com/yuan/io");
            char[] chars = new char[1024 * 512];

            //边读边写
            int dataCount = 0;
            while((dataCount = in.read(chars)) != -1){
                out.write(chars,0,dataCount);
            }

            //刷新
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (in != null) {

                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
