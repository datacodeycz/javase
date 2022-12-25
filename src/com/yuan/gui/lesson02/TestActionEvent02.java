package com.yuan.gui.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEvent02 {



    public static void main(String[] args) {
        //两个按钮  实现同一个监听事件
        Frame frame = new Frame("开始 -- 关闭");

        Button start = new Button("start");
        Button stop = new Button("stop");

        //可以显示的定义触发会返回的命令，如果不显示定义，则会走默认的值！
        stop.setActionCommand("stop");

        MyMonitor myMonitor = new MyMonitor();

        frame.add(start,BorderLayout.NORTH);
        frame.add(stop,BorderLayout.SOUTH);


        start.addActionListener(myMonitor);
        stop.addActionListener(myMonitor);

        frame.setBackground(Color.orange);
        frame.setSize(500,500);
        frame.setLocation(100,100);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

}

class MyMonitor implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        //e.getActionCommand()获取按钮的信息
        System.out.println("按钮被点击了"+ e.getActionCommand());

    }
}