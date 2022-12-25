package com.yuan.exception.demo01;

public class Test01 {
    public static void main(String[] args) {

        int a = 1;
        int b = 0;

        //假设要捕获多个异常时 必须从小->大(范围)


        try{  //try内为监控区域
            System.out.println(a/b);
        }catch(Error e){  //catch（想要捕获的异常类型） 为捕获异常
            System.out.println("Error");
        }catch(Exception e){
            System.out.println("Exception");

        }catch(Throwable t){
            System.out.println("Throwable");

        }finally{  //处理善后工作
            System.out.println("finally");
        }
        //可以不用finally 但在涉及需要关闭资源（多线程 scanner I/O）时 需要使用finally

    }

}
