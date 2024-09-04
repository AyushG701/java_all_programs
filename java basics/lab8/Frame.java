package lab8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

// creating frame using inheritance
public class Frame extends JFrame {

    // creating pannel
    JPanel p1, p2, p3, p4, p5;

    Frame() {
        setVisible(true);
        setSize(600, 600);
        setTitle("second frame");
        setLocation(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // setLayout(new BorderLayout());
        // setLayout(new FlowLayout(FlowLayout.LEADING));
        // setLayout(new GridLayout(3,2)); // 3 rows and 2 columns

        // setLayout(new CardLayout()); //first ma vayeko chai display hunxa

        setLayout(null);


        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p1.setBackground(Color.blue);
        p2.setBackground(Color.red);
        p3.setBackground(Color.green);
        p4.setBackground(Color.orange);
        p5.setBackground(Color.YELLOW);

        // add(p1, BorderLayout.NORTH);

        // add(p2, BorderLayout.SOUTH);

        // add(p3, BorderLayout.EAST);

        // add(p4, BorderLayout.WEST);
        // // by default center
        // add(p5);

        p1.setBounds(20, 20, 100, 100);
        p2.setBounds(130, 20, 100, 100);
        p3.setBounds(240, 20, 100, 100);
        p4.setBounds(350, 20, 100, 100);
        p5.setBounds(460, 20, 100, 100);

        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);

    }
}
