package com.yuan.reflect.reflect;

import com.yuan.reflect.bean.Student;

import java.lang.reflect.Field;

/*
必须掌握：
    怎么通过反射机制访问一个java对象的属性？
        给属性赋值 set
        获取属性的值 get
 */
public class ReflectTest07 {
    public static void main(String[] args) throws Exception{
        Class studentClass =  Class.forName("com.yuan.reflect.bean.Student");
        // 不使用反射机制去访问属性时，
        Student student =  new Student();
        //给属性赋值
        student.no = 1000;
        /*
        三要素：
           给s对象的no赋值1111
           要素1：对象s
           要素2：no属性
           要素3：1111
         */
        //读属性值
        //两个要素：获取s对象no属性的值
        System.out.println(student.no);

        // 实例化student对象 object就是student对象
        Object object = studentClass.newInstance();
        Field noField = studentClass.getDeclaredField("no");
        Field nameField = studentClass.getDeclaredField("name");
        // 同样满足三要素
        noField.set(object, 200);
        //打破封装（反射机制的缺点：打破封装，可能会给不法分子留下机会！！）
        // 这样设置完后，在外部也是可以访问private的
        nameField.setAccessible(true);

        // 同样满足两要素
        nameField.set(object, "ycz");
        System.out.println(noField.get(object));

        System.out.println(nameField.get(object));


    }
}
