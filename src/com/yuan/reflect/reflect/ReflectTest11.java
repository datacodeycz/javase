package com.yuan.reflect.reflect;

import com.yuan.reflect.bean.Vip;

import java.lang.reflect.Constructor;

/*


 */
public class ReflectTest11 {
    public static void main(String[] args) throws Exception{
        /*
        int no;
        String name;
        String birth;
        boolean sex;
         */
        // 不使用反射机制怎么创建对象
        Vip vip =  new Vip();
        Vip vip1 = new Vip(100,"ycz","2002-01-22",true);

        //使用反射机制创建对象
        Class c =  Class.forName("com.yuan.reflect.bean.Vip");
        // 调用无参构造方法
        Object obj = c.newInstance();
        System.out.println(obj);

        // 调用有参的构造方法
        // 第一步：先获取到这个有参数的构造方法
        Constructor con = c.getDeclaredConstructor(int.class, String.class, String.class, boolean.class);
        // 第二步：调用构造方法new对象
        Object newObj = con.newInstance(110, "ycz", "2002-01-22", true);
        System.out.println(newObj);
    }
}
