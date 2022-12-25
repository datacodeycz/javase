package com.yuan.array;

public class Test04 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        //输出全部数组元素
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("============");
        //计算数组之和
        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            sum += array[i];
        }
        System.out.println("sum="+sum);
        System.out.println("============");
        //寻找数组中最大的数
        int max = 0;
        for (int i = 0; i <array.length ; i++) {
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println("max="+max);

    }
}
