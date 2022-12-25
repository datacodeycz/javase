package com.yuan.collection;

/*
增强for循环
 */
public class ForEachTest01 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,32,33,341,14,142};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("====================");
        //增强for循环
        //for(元素类型 变量名:数组或集合)
        //foreach缺点：没有下标，在需要使用下标时，不建议使用
        for(int data : arr){
            //data就是数组中的元素
            System.out.println(data);
        }


    }
}
