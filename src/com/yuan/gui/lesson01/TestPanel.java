package com.yuan.gui.lesson01;


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPanel {
    public static void main(String[] args) {

        Frame frame = new Frame();
        Panel panel = new Panel();

        //设置布局
        frame.setLayout(null);

        //设置坐标
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(22, 151, 6));

        //设置Panel坐标  要对于frame而言
        panel.setBounds(100,100,100,100);
        panel.setBackground(new Color(30,20,100));

        //在窗口里加上panel  frame.add(panel)
        frame.add(panel);


        //监听事件，监听窗口关闭事件 System.exit(0);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            //窗口点击关闭时需要做的事情
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //开启显示
        frame.setVisible(true);


    }
}
