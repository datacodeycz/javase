package com.yuan.gui.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFlowLayout {
    public static void main(String[] args) {

        Frame frame = new Frame();

        //组件——按钮
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");

        //设置流失布局
        //frame.setLayout(new FlowLayout());//默认的从中间(CENTER)开始
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        //frame.setLayout(new FlowLayout(FlowLayout.LEFT));//从左边开始
        //frame.setLayout(new FlowLayout(FlowLayout.RIGHT));//从右边开始


        //设置窗口大小
        frame.setSize(200,200);

        //设置窗口可见性
        frame.setVisible(true);

        //添加组件
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        //监听事件 监听窗口关闭事件
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
