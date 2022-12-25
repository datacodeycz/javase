package com.yuan.algorithm;

class Two{
    Byte x;
}
class Test01{
    public static void main(String[] args){
        Test01 p=new Test01();
        p.start();
    }
    void start(){
        Two t=new Two();
        System.out.print(t.x+"");
        Two t2=fix(t);
        System.out.print(t.x+"" +t2.x);
    }
    Two fix(Two tt){
        tt.x=42;
        return tt;
    }
}

