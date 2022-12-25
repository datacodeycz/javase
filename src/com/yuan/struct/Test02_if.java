package com.yuan.struct;

//if语句
import java.util.Scanner;

public class Test02_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数据：");
        String string = scanner.nextLine();
            //equals判断字符串是否相等
        if( string.equals("Hello")){
            System.out.println(string);
        }
            System.out.println("End");
        scanner.close();
    }
}
//if——双选择结构
class Test02_if_Else{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = scanner.nextInt();
        if(score>=60){
            System.out.println("你及格!");
        }else{
            System.out.println("不及格!");
        }
        scanner.close();
    }
}
//if-多选择结构
class Test02_If_Elseif{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = scanner.nextInt();
        if(score > 90&& score <100){
            System.out.println("优秀！");
        }
        else if(score > 80&& score <100){
            System.out.println("良好");
        }
        else if(score > 70&& score <100){
            System.out.println("中等");
        }
        else if(score > 60&& score <100){
            System.out.println("及格");
        }
        else if (score <60&& score>=0){
            System.out.println("不及格");
        }
        else{
            System.out.println("输入的成绩不合法");
        }
        scanner.close();
    }
}