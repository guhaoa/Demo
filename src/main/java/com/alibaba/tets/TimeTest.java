package com.alibaba.tets;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;

/**
 * @author MSI
 * @date 2017/07/30
 */
public class TimeTest {

    public static void main(String[] args) {
        ActionListener timePrinter = new TimePrinter();
        Timer timer = new Timer(-1, timePrinter);
        System.out.println("开始");
        timer.start();

    }
}

 class TimePrinter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone , the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}