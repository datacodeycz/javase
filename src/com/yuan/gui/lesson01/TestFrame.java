package com.yuan.gui.lesson01;

import java.awt.*;
//GUI第一个界面
public class TestFrame {
    public static void main(String[] args) {

        //Frame，看不懂 可以去看源码！
        Frame frame = new Frame("我的第一个GUI界面");

        //需要设置可见性
        frame.setVisible(true);

        //设置窗口大小
        frame.setSize(400,400);

        //设置背景颜色
        frame.setBackground(new Color(160, 22, 26));

        //设置弹窗的位置
        frame.setLocation(200,200);

        //设置大小固定
        frame.setResizable(false);


    }
}
