<<<<<<< HEAD
package packageA;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class class1 implements ActionListener {

    final JFrame frame;
    final TextField tf;

    final String[] buttons;

    public class1() {
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

//            Integer number = Integer.parseInt(s);




        }



        }


    public static void main(String[] args) {
        new class1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      //  for (int i = 0; i < buttons.length; i++) {
            for (int i = 0; i < buttons.length; i++) {
            String text = ((JButton) e.getSource()).getText();

Integer x = Integer.valueOf(buttons[i]);

            if (text == buttons[i]) {
                tf.setText(tf.getText()  + text);






            }
        }
    }
}







=======
package packageA;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class class1 implements ActionListener {

    final JFrame frame;
    final TextField tf;

    final String[] buttons;

    public class1() {
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

//            Integer number = Integer.parseInt(s);




        }



        }


    public static void main(String[] args) {
        new class1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      //  for (int i = 0; i < buttons.length; i++) {
            for (int i = 0; i < buttons.length; i++) {
            String text = ((JButton) e.getSource()).getText();

Integer x = Integer.valueOf(buttons[i]);

            if (text == buttons[i]) {
                tf.setText(tf.getText()  + text);






            }
        }
    }
}







>>>>>>> 2c35fd6ac5307c9588f682ec08f769491c7a9d6b
