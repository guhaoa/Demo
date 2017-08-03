package com.alibaba.tets;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

import javax.swing.*;

/**
 * @author MSI
 * @date 2017/07/30
 */
public class Lambda {

    public static void main(String[] args) {
        String[] planet = new String[] {"Mery", "Earth", "Saturn", "Nepturn"};
        //System.out.println(Arrays.toString(planet));
        Arrays.sort(planet,String::compareToIgnoreCase);
        System.out.println("order: " + Arrays.toString(planet));

        Arrays.sort(planet, (first, second) -> first.length() - second.length());
        System.out.println("length order: " + Arrays.toString(planet));



        Timer t = new Timer(1000, exent ->
            {
                System.out.println("at the tone :" + new Date());
                Toolkit.getDefaultToolkit().beep();
            }
        );

        t.start();

        //JOptionPane.showMessageDialog(null,"Quit program?");
        //System.exit(0);
        Timer timer = new Timer(1000, event ->
        {
            System.out.println("at the time :" + new Date());
            Toolkit.getDefaultToolkit().beep();
        });

        timer.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }

}