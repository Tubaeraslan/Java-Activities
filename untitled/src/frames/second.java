package frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class second extends JFrame implements ActionListener {
    JButton jb1;
    JButton jb2;
    JTextField jt;
    second(){

        jt= new JTextField();
        jt.setBounds(50,30,150,30);
        add(jt);

        jb1= new JButton("Click me");
        jb1.setBounds(50,70,150,30);
        add(jb1);
        jb1.addActionListener(this);

        jb2= new JButton("Exit");
        jb2.setBounds(250,300,150,30);
        add(jb2);
        jb2.addActionListener(this);

        setLayout(null);
        setSize(400,400);
        getContentPane().setBackground(Color.blue);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        jt.setText("Design coding");
        getContentPane().setBackground(Color.red);
    }

    public static void main(String[] args) {

        second  a = new second();

    }
}
