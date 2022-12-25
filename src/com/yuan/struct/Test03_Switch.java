package com.yuan.struct;

//Switch语句
import java.util.Scanner;

public class Test03_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int s = scanner.nextInt();
        //case穿透！
        switch (s / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break; //break 可选 break 退出语句
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("E");
                break;
        }
        scanner.close();
    }
}
    class Test03_Switch_String{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入你的编码：");
            String str = scanner.nextLine();
            switch(str){
                case "ycz":
                    System.out.println("登录成功，你的编码是"+str);  break;
                case "cty":
                    System.out.println("登录成功，你的编码是"+str); break;
                default:
                    System.out.println("你的编码错误！"); break;
            }

            scanner.close();

        }



    }
