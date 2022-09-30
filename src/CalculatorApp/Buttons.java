package CalculatorApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Buttons extends CalculatorFrame implements ActionListener  {

    static String[] buttons;

    public void buttons() {

        JPanel bPanel = new JPanel();

        frame.add(bPanel, BorderLayout.CENTER);
        bPanel.setBackground(Color.black);
        bPanel.setLayout(new GridLayout(5, 4, 3, 3));

        buttons = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                ".", "+", "-", "x", "/", "=", "clr", "(", ")"};

        for (String s : buttons) {

            JButton button;
            bPanel.add(button = new JButton(s));
            button.addActionListener(this);

            }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < buttons.length; i++) {
            String text = ((JButton) e.getSource()).getText();
            if (text == buttons[i]) {
                tf.setText(tf.getText() + text);
            }
        }
    }
}