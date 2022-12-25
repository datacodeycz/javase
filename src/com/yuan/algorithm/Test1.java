package com.yuan.algorithm;

public class Test1 {
    public static void main(String[] args) {

        Test1 test1 = new Test1();
        test1.mystery(1234);
    }

    public void mystery (int x)
    {
        System.out.print(x % 10);

        if ((x / 10) != 0)
        {
            mystery(x / 10);
        }
        System.out.print(x % 10);
    }
}
