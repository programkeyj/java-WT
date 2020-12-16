package com.partola;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class SimpleComp extends Frame {
    SimpleComp(String s) {
        super(s);
        setLayout(null);
        Font f = new Font("serif", Font.BOLD, 15);
        setFont(f);
        Label l1 = new Label("что желаете?", Label.CENTER);
        l1.setBounds(10, 50, 120, 30);
        add(l1);
        Label l2 = new Label("выберете способ оплаты?");
        l2.setBounds(160, 50, 120, 30);
        add(l2);

        Checkbox ch1 = new Checkbox("софт");
        ch1.setBounds(20, 90, 100, 30);
        add(ch1);
        Checkbox ch2 = new Checkbox("гайды");
        ch2.setBounds(20, 120, 100, 30);
        add(ch2);
        Checkbox ch3 = new Checkbox("книгу по java 2");
        ch3.setBounds(160, 50, 200, 30);
        add(ch3);

        CheckboxGroup grp = new CheckboxGroup();
        Checkbox chg1 = new Checkbox("visa or mastercard", grp, true);
        chg1.setBounds(170, 90, 200, 30);
        add(chg1);
        Checkbox chg2 = new Checkbox("со щёта", grp, false);
        chg2.setBounds(170, 120, 200, 30);
        add(chg2);

        Button b1 = new Button("подтвердить");
        b1.setBounds(30, 220, 100, 30);
        add(b1);
        Button b2 = new Button("выйти");
        b2.setBounds(250, 220, 100, 30);
        add(b2);

        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        Frame f = new SimpleComp(" keyjs");
        f.addWindowListener(new WindowAdapter() {
            public void WindowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
    }
}




		