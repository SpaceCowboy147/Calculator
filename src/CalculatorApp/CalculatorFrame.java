package CalculatorApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculatorFrame {
    static JFrame frame;
    static TextField tf;
    static JMenuBar menuBar;
    static JMenu menuSelectName;
    static JMenuItem menuSelectedItems;

   static void calculatorFrame() {

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.green);

        JPanel top = new JPanel();
        top.setBackground(Color.darkGray);
        top.setPreferredSize(new Dimension(100, 100));
        frame.add(top, BorderLayout.NORTH);

        tf = new TextField();
        top.add(tf);
        tf.setEditable(false);
        tf.setFont(new Font(null, Font.BOLD, 50));
        tf.setPreferredSize(new Dimension(500, 80));

        menuSelectName = new JMenu("Change Color");
        menuBar = new JMenuBar();
        menuBar.add(menuSelectName);
        frame.add(menuBar);
        frame.setJMenuBar(menuBar);

        menuSelectedItems = new JMenuItem("Black");
       menuSelectName.add(menuSelectedItems);
       menuSelectedItems = new JMenuItem("Green");
       menuSelectName.add(menuSelectedItems);
       menuSelectedItems = new JMenuItem("Blue");
       menuSelectName.add(menuSelectedItems);
       menuSelectedItems = new JMenuItem("Dark Gray");
       menuSelectName.add(menuSelectedItems);
       menuSelectedItems = new JMenuItem("Cyan");
       menuSelectName.add(menuSelectedItems);

        menuSelectedItems.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String text = ((JMenuItem) e.getSource()).getText();
                if (text.equals ("Cyan")) {
                    frame.getContentPane().setBackground(Color.cyan);
                    top.setBackground(Color.cyan);
                }
                if (text.equals ("Black")) {
                    frame.getContentPane().setBackground(Color.black);
                    top.setBackground(Color.black);
                }
                if (text.equals ("Green")) {
                    frame.getContentPane().setBackground(Color.green);
                    top.setBackground(Color.green);
                }
                if (text.equals ("Blue")) {
                    frame.getContentPane().setBackground(Color.blue);
                    top.setBackground(Color.black);
                }
                if (text.equals ("Gray")) {
                    frame.getContentPane().setBackground(Color.darkGray);
                    top.setBackground(Color.darkGray);
                }

                }

        });

       }



    }

