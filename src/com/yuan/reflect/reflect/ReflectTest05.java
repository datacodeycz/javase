package com.yuan.reflect.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*


 */
public class ReflectTest05 {
    public static void main(String[] args) throws Exception{
        Class classStudent = Class.forName("com.yuan.reflect.bean.Student");

        String classStudentName = classStudent.getName();
        String simpleStudentName = classStudent.getSimpleName();
        // 获取类的名字
        System.out.println(classStudentName);
        //简写名字
        System.out.println(simpleStudentName);

        //获取类中所有public修饰的Field
        Field[] fields = classStudent.getFields();
        System.out.println(fields.length);// 测试数组中只有2个元素

        // 取出这个field
        Field f0 = fields[0];
        Field f1 = fields[1];
        //获取出这个field它的名字
        String fieldName0 = f0.getName();
        String fieldName1 = f1.getName();


        System.out.println(fieldName0); //就是这个属性Field的名字
        System.out.println(fieldName1);

        // 获取所有的Field
        Field[] fs = classStudent.getDeclaredFields();
        System.out.println(fs.length);

        System.out.println("===============================");

        //遍历field
        for(Field field : fs){
            // 获取属性的修饰符列表
            int modifiers = field.getModifiers();
            System.out.println(modifiers); // 只是返回int 修饰符代表的数字,每个数字是一个修饰符的代号
            // 返回的是修饰符的String
            String  modifierString = Modifier.toString(modifiers);
            System.out.println(modifierString);
            // 获取属性的类型
            Class fieldType = field.getType();
            String simpleName = fieldType.getSimpleName();
            System.out.println("简写" + simpleName);
            System.out.println(fieldType);
            //获取属性的名字
            System.out.println(field.getName());
        }


    }
}
