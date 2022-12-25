package com.yuan.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //temp2文件不存在的时候会自动新建！
            //这种方式谨慎使用，这种方式会先将原文件清空，然后重新写入。
            //fos = new FileOutputStream("src/com/yuan/io/temp2");
            //以追加的方式在文件末尾写入。不会清空原文件内容。
            fos = new FileOutputStream("src/com/yuan/io/temp2",true);

            //开始写
            byte[] bytes = {97,98,99,100,101};
            //将byte数组全部写出！
            fos.write(bytes);
            //从bytes部分写入 以下是前3个
            fos.write(bytes,0,3);

            String s = "ycz";
            //将字符串转换为byte然后写出
            byte[] bytes1 = s.getBytes();

            fos.write(bytes1);


            //刷新（最后一定要刷新）
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
