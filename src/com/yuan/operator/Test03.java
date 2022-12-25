package com.yuan.operator;

/*类变量 在main（）之外 且前面加上static
实例变量 放在类里 不可在方法里面直接使用
局部变量 放在方法里面的，方法结束，变量消失。
*/
public class Test03 {
    int b = 100;
    static int a =10;

    public static void main(String[] args) {
      int name = 1;
       Test03 test03 =new Test03();
    }
}
