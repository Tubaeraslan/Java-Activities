package frames;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class first {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame Example");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("JFrame by example");
        JButton button = new JButton();
        button.setText("Button");
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setSize(700,300);
        panel.setLayout(null);
        button.setBounds(270,180,150,25);
        panel.setBackground(Color.green);
        button.setBackground(Color.yellow);
        button.setBorder(new LineBorder(Color.red));
        button.setOpaque(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
