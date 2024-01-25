package org.patterns.obesrver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    public void go() {
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(event ->
                System.out.println("Don`t do it"));
        button.addActionListener(new DevilListener());

        button.setBounds(130, 100, 200, 80);

        //set frame properties here
        frame.add(button);

        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    static class DevilListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Do it!!");
        }
    }
}
