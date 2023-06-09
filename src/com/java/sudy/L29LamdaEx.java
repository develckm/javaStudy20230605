package com.java.sudy;

import java.awt.*;
import java.awt.event.*;

public class L29LamdaEx {
    public static void main(String[] args) {
        Frame f=new Frame();
        Button b=new Button("btn");
        Label l=new Label("");
        //함수를 매개변수로 하는 것 처럼!!! 사용하는 것이 람다식
        b.addActionListener((e)->{
            l.setText("hello");
        });

        f.add(b,BorderLayout.NORTH);
        f.add(l,BorderLayout.CENTER);
        f.setBounds(0,0,300,300);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
//        f.addWindowListener(new WindowListener() {
//            @Override
//            public void windowOpened(WindowEvent e) {//화면이 열릴때
//            }
//
//            @Override
//            public void windowClosing(WindowEvent e) {//x버튼을 누를때
//                f.dispose();
//            }
//
//            @Override
//            public void windowClosed(WindowEvent e) {//윈도가 종료될때
//            }
//
//            @Override
//            public void windowIconified(WindowEvent e) {//최소화가 되었을 때
//            }
//
//            @Override
//            public void windowDeiconified(WindowEvent e) {
//            }
//
//            @Override
//            public void windowActivated(WindowEvent e) {
//            }
//
//            @Override
//            public void windowDeactivated(WindowEvent e) {
//            }
//        });
    }
}
