package frames;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class third extends JFrame implements ActionListener {
    JButton jb1,jb2,jb3,jb4;
    JTextField jt1,jt2;
    JLabel lbl;

    third(){
        jt1= new JTextField();
        jt1.setBounds(90,50,150,30);
        add(jt1);

        jt2=new JTextField();
        jt2.setBounds(90,80,150,30);
        add(jt2);

        lbl=new JLabel("Result is: ");
        lbl.setBounds(90,140,150,30);
        add(lbl);

        jb1=new JButton("+");
        jb1.setBounds(90,200,100,30);
        add(jb1);

        jb2=new JButton("-");
        jb2.setBounds(90,300,100,30);
        add(jb2);

        jb3=new JButton("*");
        jb3.setBounds(90,400,100,30);
        add(jb3);

        jb4=new JButton("/");
        jb4.setBounds(90,500,100,30);
        add(jb4);

        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(jt1.getText());
        int b = Integer.parseInt(jt2.getText());
        int result=0;

        if (e.getSource().equals(jb1)){
            result=a+b;
        }
        else if (e.getSource().equals(jb2)) {
            result=a-b;
        }
        else if(e.getSource().equals(jb3)){
            result=a*b;
        }
        else if (e.getSource().equals(jb4)) {
            result=a/b;
        }
        lbl.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        third a = new third();
    }

}

