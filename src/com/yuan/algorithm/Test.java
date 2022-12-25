package com.yuan.algorithm;

public class Test {
    public static void main(String[] args) {
    float max = 0;
    float money=0;
    int num=0;
    float[] b = new float[] {(float) 19.9,23,21,16};
    float [][] a = new float[][] {{0, 0, 35, 17},{0, 4, 42, 0},{0, 4, 42, 0},{0, 8, 0, 48},{59, 0, 0, 0},{8, 0, 41, 0}, {11, 0, 0, 51}, {3, 0, 41, 5}, {20, 9, 18, 0}, {0, 0, 47, 0}, {42, 9, 0, 0}, {17, 12, 0, 21}, {9, 7, 19, 14}, {0, 0, 0, 61}, {0, 31, 0, 0}};
    for (int i = 0; i <15; i++) {

        if (max<money){
            max=money;
            num=i+1;
        }
        money=0;
        for (int j = 0; j <4; j++) {

            money =  (b[j]*a[i][j]+money);

        }
    }
    System.out.println(max);
    System.out.println(num);
}
}
