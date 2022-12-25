package com.yuan.struct;

//for循环
public class Test05_For {
    public static void main(String[] args) {
        //九九乘法表
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%d*%d=%-4d",j,i,j*i);
            }
            System.out.println();
        }
    }
}

class Test05_For_01{
    public static void main(String[] args) {
        //1~100以内的奇数偶数和
        int oddSum =0;//奇数和
        int evenSum = 0;//偶数和
        for (int i=1;i<=100;i++)
        {
            if((i%2!=0)){
                oddSum+=i;
            }else{
                evenSum+=i;
            }
        }
        System.out.println("奇数和为"+oddSum);
        System.out.println("偶数和为"+evenSum);
    }
}
class Test05_For_02{
    public static void main(String[] args) {
        //用for循环实现1~1000能被5整除的数，并且一行输出三个
        for (int i = 0; i < 1000; i++) {
            if(i%5==0) {
                System.out.print(i + "\t");
            }
            if(i%(5*3)==0) {
                System.out.println();
            }
            //println 输出完 换行
            //print 输出完 不换行
        }
    }
}

//增强for循环
class Test05_For_03{
    public static void main(String[] args) {
        int [] number = {10,20,30,40,50};
        //正常for循环
        for (int i = 0; i < 5; i++) {
            System.out.println(number[i]);
        }
        System.out.println("========================");
        //遍历数组的元素
        for (int x : number){
            System.out.println(x);
        }
    }
}