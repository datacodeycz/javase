package com.yuan.collection;

/*
自定义泛型
    自定义泛型的时候，<>尖括号中是一个标识符，随便写什么
    java源代码中常出现的是：
        <E>和<T>
      E是Element单词首字母
      T是Type单词首字母


 */
public class GenericTest03<sdasdasdasdasd> {
    public void toSome(sdasdasdasdasd o){

        System.out.println(0);
    }

    public static void main(String[] args) {
        //在new对象的时候指定了泛型是：String类型
        GenericTest03<String> objectGenericTest03 = new GenericTest03<>();

        //所以这里只能填写字符串类型的值
        objectGenericTest03.toSome("adc");


        GenericTest03<Integer> integerGenericTest03 = new GenericTest03<>();

        integerGenericTest03.toSome(1);


    }
}
