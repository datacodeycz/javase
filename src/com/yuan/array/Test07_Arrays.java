package com.yuan.array;

import java.util.Arrays;

public class Test07_Arrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 9, 4, 8, 3, 7};
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        printArray(a);
    }
    public static void printArray(int a[]){
        for (int i = 0; i < a.length; i++) {
            if(i==0){
                System.out.print("[");
            }

            System.out.print(a[i]);
            if(i==a.length-1){
                System.out.print("]");
            }else{
                System.out.print(", ");
            }
        }
    }
}
