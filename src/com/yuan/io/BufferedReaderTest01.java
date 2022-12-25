package com.yuan.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
BufferedReader：
    带有缓冲区的字符输入流。
    使用这个流的时候不需要自定义char数组，或者说不需要自定义byte数组，自带缓冲。
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) {
        FileReader  in = null;
        BufferedReader br = null;

        try {
            //当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流。
            //外部负责包装的这个流，叫做包装流/处理流。
            //比如这个程序 FileReader就是一个节点流，BufferedReader就是包装流/处理流。
            in = new FileReader("src/com/yuan/io/CopyTest02.java");
            br = new BufferedReader(in);

          /*  String line1 = br.readLine();
            String line2 = br.readLine();
            String line3 = br.readLine();
            System.out.println(line1);
            System.out.println(line2);
            System.out.println(line3);*/

            //br.readline()方法读取一个文本行，但不带换行符。
            String s = null;
            while((s = br.readLine()) != null){
                System.out.println(s);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            //关闭流
            //对于包装流来说，只需要关闭最外层流就行，里面的节点流会自动关闭(可以看源代码)
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
