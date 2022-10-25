package com.xyz.d9_lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo3 {
    public static void main(String[] args) {
        Integer ages[] = {34, 12, 42, 23};
//        Arrays.sort(ages, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });

        Arrays.sort(ages, (Integer o1, Integer o2) -> {
            return o2 - o1;  // 讲学
        });
        System.out.println(Arrays.toString(ages));

        System.out.println("--------------------");
        JFrame win = new JFrame("登录界面");

        JButton btn = new JButton("我是一个很大的按钮");
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("有人点我");
//            }
//        });
        btn.addActionListener((ActionEvent e)->{
            System.out.println("有人点我");
        });

        win.add(btn);
        win.setSize(400, 300);
        win.setVisible(true);
    }

}
