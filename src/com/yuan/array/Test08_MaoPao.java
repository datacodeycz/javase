package com.yuan.array;

import java.util.Arrays;

/*
冒泡排序
1．比较数组中，两个相邻的元素，如果第一个数比第二个数大，我们就交换他们的位置
2.每一次比较，都会产生出一个最大，或者最小的数字;
3.下一轮则可以少一次排序!
4.依次循环,直到结束!
 */
public class Test08_MaoPao {
    public static void main(String[] args) {
        int [] a ={2,3,1,10,9,5,3,4};
        int [] b = sort(a);
        System.out.println(Arrays.toString(b));
    }
    //冒泡排序方法
    public static int[] sort(int[] array){
        int tmpe = 0;//作为交换的临时变量

        //外层循环，执行一轮比较的次数
        for (int i = 0; i <array.length -1 ; i++) {
            boolean falg = false;//通过falg标识符去减少没有意义的比较

            for (int j = 0; j <array.length-1-i ; j++) {
                //内层循环 交换两个数的大小

                if(array[j+1]<array[j]){
                    tmpe = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmpe;  //交换j与j+1的值  采用中间临时变量
                    falg = true;
                }

            }
            if(!falg){
                break;
            }
        }
        return array;
    }

}
