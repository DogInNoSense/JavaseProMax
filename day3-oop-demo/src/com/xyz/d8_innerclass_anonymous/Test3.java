package com.xyz.d8_innerclass_anonymous;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 通过GUI变成 理解匿名内部类的真实使用场景
 */
public class Test3 {
    public static void main(String[] args) {
        // 1.创建窗口
        JFrame win = new JFrame("登录界面");
        JPanel panel = new JPanel();
        win.add(panel);


        // 2.创建一个按钮对象
        JButton btn = new JButton("登录");
        // 注意: 匿名内部类的使用
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(win, "点了我一下");
//            }
//        });

        // 简化写法
        btn.addActionListener(e -> JOptionPane.showMessageDialog(win, "点了我一下"));


        // 3.把按钮对象添加到创建展示
        panel.add(btn);

        // 4.展示窗口
        win.setSize(400, 300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }

}

