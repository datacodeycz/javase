package com.yuan.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
java.io.DataOutputStream:数据专属的流。
这个流可以将数据连同数据的类型一并写入文件。
注意：这个文件不是普通文本文件。（用记事本打不开）
 */
public class DataOutputStreamTest01 {
    public static void main(String[] args) {
        DataOutputStream dos = null;

        try {
            //创建数据专属的字节输出流
            dos = new DataOutputStream(new FileOutputStream("Src/com/yuan/io/temp5"));

            //写数据
            byte b = 1;
            short s = 20;
            int  i = 100;
            long l = 20000;
            float f = 100.0f;
            double d = 3.14;
            boolean o = false;
            char c = 'a';

            dos.writeByte(b);
            dos.writeShort(s);
            dos.writeInt(i);
            dos.writeLong(l);
            dos.writeFloat(f);
            dos.writeDouble(d);
            dos.writeBoolean(o);
            dos.writeChar(c);

            //刷新
            dos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (dos != null) {
                try {
                    //关闭
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
