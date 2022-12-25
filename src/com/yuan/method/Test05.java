package com.yuan.method;

//可变参数
//在方法声明中，在指定参数类型后加一个省略号（...）
//一个方法中只能指定一个可变参数，它必须是方法的最后一个参数，任何普通的参数必须在它之前声明
public class Test05 {
    public static void main(String[] args) {
        Test05 test= new Test05();
        test.add(10,50,2,32,5,4,50,1);


    }
    public static void add(int ...i){
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
        System.out.println(i[4]);
        System.out.println(i[5]);
        System.out.println(i[6]);
        System.out.println(i[7]);
    }
}
