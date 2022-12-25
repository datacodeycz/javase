package com.yuan.struct;

//continue
public class Test07_continue {
    public static void main(String[] args) {
        int i = 0;
        while(i<100){
            i++;
            if(i%10==0){
                System.out.println();
                continue;//跳出该次循环即可，其他照常执行；
            }
            System.out.println(i);
        }
    }
}
//goto为关键词
