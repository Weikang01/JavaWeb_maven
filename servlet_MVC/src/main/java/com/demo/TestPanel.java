package com.demo;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame("I am a window");  // create a window
        Panel panel = new Panel(null);  // panel
        frame.setLayout(null);  // set layout

        frame.setBounds(0, 0, 800, 600);
        frame.setBackground(new Color(78, 91, 206));
        panel.setBounds(50, 50, 300, 400);
        panel.setBackground(new Color(122, 220, 229));

        frame.add(panel);

        frame.setVisible(true);

        // listen close event
        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });

    }
}
