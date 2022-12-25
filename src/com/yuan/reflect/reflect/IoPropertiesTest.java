package com.yuan.reflect.reflect;

import java.io.InputStream;
import java.util.Properties;

public class IoPropertiesTest {
    public static void main(String[] args) throws Exception{
//        // 获得一个文件的绝对路径
//        String path = Thread.currentThread().getContextClassLoader().
//        getResource("classinfo2.properties").getPath();
//
//        // IO流
//        FileReader reader = new FileReader(path);
        //直接以流的形式返回
        InputStream reader = Thread.currentThread().getContextClassLoader().
                getResourceAsStream("classinfo2.properties");
        Properties pro =  new Properties();
        //加载
        pro.load(reader);
        //关闭
        reader.close();

        // 通过key获取value
        String className = pro.getProperty("className");
        System.out.println(className);

    }
}
