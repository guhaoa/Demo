package com.alibaba.tets;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.*;

import com.alibaba.interfaces.Person;

import org.junit.Test;

/**
 * @author MSI
 * @date 2017/07/30
 */
public class Demo01 {
    public static void main(String[] args) {
        /*List<String> list = new ArrayList<>();
        list.add("nihao");
        list.add("ni");
        list.add("nihahaaad");
        list.add(null);
        System.out.println(list.toString());

        list.removeIf(e -> e==null);
        System.out.println(list.toString());*/
        repeatMessage("你好啊",1000);


        new Thread();
    }

    @Test
    public void test01() {
        Timer  timer = new Timer(1000,System.out::println);

        timer.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);

    }

    @Test
    public void test02() {
        List<String> names = new ArrayList<>();
        names.add("张三");
        names.add("王八蛋");

        List<Person> list = names.stream().map(Person::new).collect(Collectors.toList());

        System.out.println(list.toString());

    }

    public static void repeatMessage(String text,int delay) {
        ActionListener listener = event -> {
            System.out.println(text);
            Toolkit.getDefaultToolkit().beep();
            };
        new Timer(delay,listener).start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}
