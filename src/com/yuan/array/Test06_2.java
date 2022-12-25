package com.yuan.array;

/*
二维数组就是在一维数组中的每个元素中，写入一个一维数组，多维数组一样
 */
public class Test06_2 {
    public static void main(String[] args) {
        int[][] array = {{1,2},{3,4},{5,6}};
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print("  "+array[i][j]);
            }
            System.out.println();
        }

    }
}
class Test06_3{
    public static void main(String[] args) {
        int [][] array = new int[3][2];
        array[0][0] =1 ;
        array[0][1] =2 ;
        array[1][0] =3 ;
        array[1][1] =4 ;
        array[2][0] =5 ;
        array[2][1] =6 ;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[0].length ; j++) {
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }
    }
}