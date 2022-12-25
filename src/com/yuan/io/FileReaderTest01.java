package com.yuan.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
FileReader:
    文件字符输入流，只能读取普通文本。
    读取文本内容时，比较方便，快捷。
 */
public class FileReaderTest01 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("src/com/yuan/io/temp1");
            //创建一个字符集
            char[] chars = new char[4];
            reader.read(chars);
            //用for循环进行遍历
            for(char c : chars){
                System.out.println(c);
            }

            //创建一个字符对象
            /*char[] chars = new char[4];//一次性能读四个字符
            int dataCount = 0;
            while((dataCount = reader.read(chars) ) != -1){
                System.out.print(new String(chars,0,dataCount));
            }*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
