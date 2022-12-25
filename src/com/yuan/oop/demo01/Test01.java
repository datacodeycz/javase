package com.yuan.oop.demo01;

//Test01 类
public class Test01 {
    //main 方法
    public static void main(String[] args) {

    }
    /*
    修饰符 返回值类型 方法名（...）{
    //方法体
    .... .....
    ....
    return 返回值
    }
     */
    public String sayHello(){
        return "Hello World";
    }
    //void 无返回值 可不写 可写return
    public void Hello(){
        return;
    }
    public int max(int a,int b){
        return a > b ? a : b;//三元运算符
    }
}


