package com.yuan.gui.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestTest01 {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();

    }


}

class MyFrame extends Frame{
     public MyFrame(){
         TextField textField = new TextField();//文本框
         add(textField);

         //监听这个文本框输入的文字
         MyActionListener1 myActionListener1 = new MyActionListener1();

         //按下enter 就会触发这个输入框的事件
         textField.addActionListener(myActionListener1);

         //设置替换编码
         textField.setEchoChar('$');
         setVisible(true);

         setBackground(Color.orange);

         setSize(300,300);

         setLocation(100,100);

         addWindowListener(new WindowAdapter() {
             @Override
             public void windowClosing(WindowEvent e) {
                 System.exit(0);
             }
         });


     }
}
//事件监听
class MyActionListener1 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        TextField textField= (TextField) e.getSource();//获得一些资源，返回的一个对象
        System.out.println(textField.getText());//获得输入框文本到命令行中
        textField.setText("");
    }
}