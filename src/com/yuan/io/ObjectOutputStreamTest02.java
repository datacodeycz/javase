package com.yuan.io;

import com.yuan.io.bean.User;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
一次序列化多个对象
    将对象放到集合中，序列化集合即可
 */
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) {

        //创建一个ArrayList集合对象
        List<User> list = new ArrayList<>();

        //向集合中添加元素对象
        list.add(new User(10,"ycz"));
        list.add(new User(30,"ycz1"));
        list.add(new User(50,"ycz3"));
        list.add(new User(40,"ycz5"));
        list.add(new User(3,"ycz7"));

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream( new FileOutputStream("src/com/yuan/io/User"));

            //写入
            oos.writeObject(list);

            //刷新
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
