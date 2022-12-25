package com.yuan.gui.lesson01;

import java.awt.*;

public class TestFrame02 {
    public static void main(String[] args) {
        //展示多个窗口
        MyFrame myFrame1 = new MyFrame(100, 100, 200, 200,Color.black);
        MyFrame myFrame2 = new MyFrame(300, 100, 200, 200,Color.yellow);
        MyFrame myFrame3 = new MyFrame(100, 300, 200, 200,Color.red);
        MyFrame myFrame4 = new MyFrame(300, 300, 200, 200,Color.orange);


    }

}
class MyFrame extends Frame {
    static int id = 0;

    public MyFrame(int x,int y,int w,int h,Color color){
        super("MyFrame"+(++id));
        setBounds(x,y,w,h);
        setBackground(color);
        setVisible(true);
    }
    //我们将一些窗口的信息封装到一个方法中 当实例化类时，即可实现展示多个窗口有

}