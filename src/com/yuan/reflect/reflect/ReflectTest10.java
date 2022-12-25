package com.yuan.reflect.reflect;

import com.yuan.reflect.service.UserService;

import java.lang.reflect.Method;

//  重要：必须掌握，通过反射机制怎么调用一个对象的方法？
public class ReflectTest10 {
    public static void main(String[] args) throws Exception{
        // 常规调用方法
        UserService userService = new UserService();
        //调用方法
        /*
        要素分析：
            要素1：对象userService
            要素2：login方法名
            要素3：实参列表
            要素4：返回值
         */
        boolean  userLogin = userService.login("admin","123");
        System.out.println(userLogin ? "登录成功" : "登录失败");


        //使用反射机制调用方法
        Class userName = Class.forName("com.yuan.reflect.service.UserService");
        // 创建对象
        Object obj = userName.newInstance();
        // 获取Method
        Method loginUserService = userName.getDeclaredMethod("login", String.class, String.class);

        // 调用方法
        // 调用方法有几个要素？ 也需要4要素
        // 反射机制中最最最最最重要的一个方法，必须记住
        // 四要素：
        /*
        LoginUserService 对象
        obj 对象
        ”admin“，”123“ 实参
        lsInvoke 返回值
         */
        Object lsInvoke = loginUserService.invoke(obj, "admin", "123");
        System.out.println(lsInvoke);

    }
}
