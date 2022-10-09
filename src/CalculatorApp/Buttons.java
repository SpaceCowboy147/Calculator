package CalculatorApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

class Buttons extends CalculatorFrame implements ActionListener {

    static String[] buttons;
    //  static String text;
    static String text;
    JButton button;

    public void buttons() {

        JPanel bPanel = new JPanel();

        frame.add(bPanel, BorderLayout.CENTER);
        bPanel.setBackground(Color.black);
        bPanel.setLayout(new GridLayout(5, 4, 3, 3));

        buttons = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                ".", "+", "-", "x", "/", "=", "clr", "(", ")", "del"};


        for (String s : buttons) {

            bPanel.add(button = new JButton(s));
            button.addActionListener(this);

        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {

            text = ((JButton) e.getSource()).getText();
            if (text.equals("0")) {
                tf.setText(tf.getText() + text); }
       if (text.equals("1")) {
            tf.setText(tf.getText() + text); }
        if (text.equals("2")) {
            tf.setText(tf.getText() + text); }
        if (text.equals("3")) {
            tf.setText(tf.getText() + text); }
        if (text.equals("4")) {
            tf.setText(tf.getText() + text); }
        if (text.equals("5")) {
            tf.setText(tf.getText() + text); }
        if (text.equals("6")) {
            tf.setText(tf.getText() + text); }
        if (text.equals("7")) {
            tf.setText(tf.getText() + text); }
        if (text.equals("8")) {
            tf.setText(tf.getText() + text); }
        if (text.equals("9")) {
            tf.setText(tf.getText() + text); }

        if (text.equals("+")) {

        }
        if (text.equals("-")) {

        }
        if (text.equals("*")) {

        }
        if (text.equals("/")) {

        }
        if (text.equals(".")) {

        }
        if (text.equals("(")) {

        }
        if (text.equals(")")) {
        }
            if (text.equals("=")) {

            }

        if (text.equals("del")) {

        }

            if (text.equals("clr")) {
                   tf.setText("");
                }
        }
    }

//       for (String button : buttons) {
//           text = ((JButton) e.getSource()).getText();
//            if (text.equals(button)) {
//                tf.setText(tf.getText() + text);
//
//                   }
//                if (text.equals("clr")) {
//                    tf.setText("");
//                }
//                if (text.equals("del")) {
//                    String tempTextField = tf.getText();
//                    tf.setText("");
//                    // for (int i = 0; i <= tempTextField.length() - 1; i++) {
//                    tf.setText(tf.getText() + tempTextField);
//                }
//                if (text.equals("1")) {
//                    tf.setText(tf.getText());
//
//
//                }
//
//            }








