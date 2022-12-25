package com.yuan.array;

//在构造方法中，去调用
public class Test05 {
    public static void main(String[] args) {
         int[] arrays = {1,2,3,4,5,6};
         //printArray(array);
        int[] a = reverse(arrays);
        printArray(a);
    }

    //打印数组元素，使用传参方式
    public static void printArray(int[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
    }
    //反转数组
    public static int[] reverse(int[] array){
        int[] reversearray = new int [array.length];
        for (int i = 0,j =reversearray.length-1 ; i <array.length ; i++,j--) {
            reversearray[j] = array[i];
        }
        return reversearray;
    }

}
