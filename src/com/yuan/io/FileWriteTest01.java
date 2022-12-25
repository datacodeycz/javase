package com.yuan.io;

import java.io.FileWriter;
import java.io.IOException;

/*
FileWrite:
    文件字符输出流。写
    只能输出普通文本。
 */
public class FileWriteTest01 {
    public static void main(String[] args) {
        FileWriter out = null;
        try {
            //创建文件字符输出流对象
            //这样会清空文本后再写字符
//            out = new FileWriter("src/com/yuan/io/temp3");
            out = new FileWriter("src/com/yuan/io/temp3",true);
           //开始写
            char[] chars = {'y','c','z'};
            out.write(chars);
            String s = "yuan_cheng_zhi";
            out.write(s);
            //换行
            out.write("\n");
            out.write(chars);

            //刷新
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
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
