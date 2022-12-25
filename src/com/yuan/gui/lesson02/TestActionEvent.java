package com.yuan.gui.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEvent {
    public static void main(String[] args) {
        //按下按钮，触发一些事件
        Frame frame = new Frame("事件监听");
        Button button = new Button("button");

        MyActionListener myActionListener = new MyActionListener();
        //按钮上增加事件，触发按钮，弹出事件
        button.addActionListener(myActionListener);

        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLocation(100,100);
        frame.setBackground(new Color(235, 16, 21));

        //frame.pack();

        WindowClose(frame);

        frame.add(button,BorderLayout.CENTER);


    }

    private static void WindowClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class MyActionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("点击了一下button");

    }
}