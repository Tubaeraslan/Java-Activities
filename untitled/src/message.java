import javax.swing.*;
import java.util.Scanner;

public class message {
    public static void main(String[] args) {
        int year;
        String input=JOptionPane.showInputDialog(null,"Enter the birth year: ");
        year=Integer.parseInt(input);
        int age=2024-year;
        JOptionPane.showMessageDialog(null,"Your age is: " + age);
    }
}
