package com.yuan.method;

public class Test04 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("arg["+i+"]:"+args[i]);

            //遍历的args里面的数据，但args里面没有数据，即输出结果是空
        }

    }
}
