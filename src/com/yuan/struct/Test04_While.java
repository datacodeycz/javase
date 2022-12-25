package com.yuan.struct;

//while语句
public class Test04_While {
    public static void main(String[] args) {
        //输出1~100
        //1+......+100;
        int i = 0;
        int sum = 0;
        while(i<100){
            i++;
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
//do-while循环
class Test04_While_Do {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        do{
            i++;
            sum+=i;
        }while(i<100);
        //至少执行一次循环，再判断
        System.out.println(sum );
    }
}
