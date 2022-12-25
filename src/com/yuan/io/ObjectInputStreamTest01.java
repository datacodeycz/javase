package com.yuan.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
反序列化
 */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            //创建反序列对象
            ois = new ObjectInputStream( new FileInputStream("src/com/yuan/io/student"));
            //开始读
           Object obj = ois.readObject();
            System.out.println(obj);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally{
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
