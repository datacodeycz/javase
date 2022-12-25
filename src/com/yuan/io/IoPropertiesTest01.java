package com.yuan.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
IO+Properties的联合应用
非常号的一个设计理念：
    以后经常改变的数据，可以单独写到一个文件中，使用程序动态读取。
    将来只需要修改这个文件的内容，java的代码不需要改动，不需要重新
    编译，服务器也不需要重启。就可以拿到动态的信息。

    类似以上机制的这种文件被成为配置文件。
    并且当配置文件中的内容格式是：
        key1=value
        key2=value
    的时候，我们把这种配置文件叫做属性配置文件。

    java规范中有要求：属性配置文件建议以.properties结尾，但这不是必须的。
    这种以.properties结尾的文件在java中被称为；属性配置文件。
    其中Properties是专门存放属性配置文件内容的一个类
 */
public class IoPropertiesTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //新建一个输入流对象
            fis = new FileInputStream("src\\com\\yuan\\io\\Userinfo.properties");

            //新建一个Map集合
            Properties properties = new Properties();

            //调用Properties对象的load方法将文件中的数据加载到Map集合中
            properties.load(fis);//文件中的数据顺着管道加载到Map集合

            //通过key来获取value
            String username = properties.getProperty("username");
            System.out.println(username);
            String password = properties.getProperty("password");
            System.out.println(password);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
