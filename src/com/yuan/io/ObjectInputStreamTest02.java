package com.yuan.io;

import com.yuan.io.bean.User;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/*
反序列化多个对象
 */
public class ObjectInputStreamTest02 {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            //创建对象 反序列化对象
            ois =  new ObjectInputStream(new FileInputStream("src/com/yuan/io/User"));
            //读
           /* Object obj = ois.readObject();
            System.out.println(obj);*/

            //这里可以直接得到结果，需要强转一下
            List<User>  list = (List<User>) ois.readObject();

            for (User user : list){
                System.out.println(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally{
            //关闭
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
