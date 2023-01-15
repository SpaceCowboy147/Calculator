package CalculatorApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Buttons extends CalculatorFrame implements ActionListener {

    static String[] buttons;

    static String text;
    JButton button;
    int numberValue;


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
            tf.setText(tf.getText() + text);
            numberValue = 0;

        }
        if (text.equals("1")) {
            tf.setText(tf.getText() + text);
            numberValue = 1;
        }
        if (text.equals("2")) {
            tf.setText(tf.getText() + text);
            numberValue = 2;
        }
        if (text.equals("3")) {
            tf.setText(tf.getText() + text);
            numberValue = 3;
        }
        if (text.equals("4")) {
            tf.setText(tf.getText() + text);
            numberValue = 4;
        }
        if (text.equals("5")) {
            tf.setText(tf.getText() + text);
            numberValue = 5;
        }
        if (text.equals("6")) {
            tf.setText(tf.getText() + text);
            numberValue = 6;
        }
        if (text.equals("7")) {
            tf.setText(tf.getText() + text);
            numberValue = 7;
        }
        if (text.equals("8")) {
            tf.setText(tf.getText() + text);
            numberValue = 8;
        }
        if (text.equals("9")) {
            tf.setText(tf.getText() + text);
            numberValue = 9;
        }

        if (text.equals("+")) {
            tf.setText(tf.getText() + text);

        }
        if (text.equals("-")) {
            tf.setText(tf.getText() + text);

        }
        if (text.equals("x")) {
            tf.setText(tf.getText() + text);
        }
        if (text.equals("/")) {
            tf.setText(tf.getText() + text);
        }
        if (text.equals(".")) {
            tf.setText(tf.getText() + text);
        }
        if (text.equals("(")) {
            tf.setText(tf.getText() + text);
        }
        if (text.equals(")")) {
            tf.setText(tf.getText() + text);
        }

        if (text.equals("del")) {
            int i = tf.getText().length();
            tf.setText(tf.getText().substring(0, i - 1));
        }

        if (text.equals("clr")) {
            tf.setText(" ");
        }
        if (text.equals("=")) {

            String parsedInteger = "";
            String operator = "";
            int aggregate = 0;
            for (int i = 0; i < tf.getText().length(); i++) {
                char c = tf.getText().charAt(i);
                if (Character.isDigit(c)) {
                    parsedInteger += c;
                }
                if (!Character.isDigit(c) || i == tf.getText().length() - 1) {
                    int parsed = Integer.parseInt(parsedInteger);
                    if (operator == "") {
                        aggregate = parsed;
                    } else {
                        if (operator.equals("+")) {
                            aggregate += parsed;
                        } else {
                            if (operator.equals("-")) {
                                aggregate -= parsed;
                            }  else {
                                if(operator.equals("x"))
                                aggregate *= parsed;
                                else {
                                    if( operator.equals("/")) {
                                        aggregate /= parsed;

                                        }
                                    }
                                }
                                }
                            }

                    parsedInteger = "";
                    operator = "" + c;
                }
            }
            tf.setText(String.valueOf(aggregate));
            System.out.println("Sum of " + tf.getText() + ":\r\n" + aggregate);
        }
        }

//            Pattern seperateNumbers = Pattern.compile("(-?)(\\d+)(+|-|*|/)(-?)(\\d+)"); //("[0-9]*\\.?[0-9]*");
//            Matcher m = seperateNumbers.matcher(tf.getText());
//            while(m.find())
//                System.out.println(m.group());
//
//            Pattern seperateOperands = Pattern.compile("[-+x/=()]");
//            Matcher matcher = seperateOperands.matcher(tf.getText());
//            while(matcher.find())
//                System.out.println(matcher.group());
//
//            Double parsedNumber = Double.parseDouble(String.valueOf(seperateNumbers));
//            System.out.println(parsedNumber);




    }














