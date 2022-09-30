package CalculatorApp;

import javax.swing.*;
import java.awt.*;


public class CalculatorFrame {
    static JFrame frame;
    static TextField tf;

   static void calculatorFrame() {

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.green);

        JPanel top = new JPanel();
        top.setBackground(Color.CYAN);
        top.setPreferredSize(new Dimension(100, 100));
        frame.add(top, BorderLayout.NORTH);

        tf = new TextField();
        top.add(tf);
        tf.setEditable(false);
        tf.setFont(new Font(null, Font.BOLD, 50));
        tf.setPreferredSize(new Dimension(500, 80));


    }

}
