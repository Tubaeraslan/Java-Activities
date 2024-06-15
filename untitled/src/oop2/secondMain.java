package oop2;

import java.util.Scanner;

public class secondMain {
    public static void main(String[] args) {
        secondExample obj = new secondExample();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first number : ");
        int number1=input.nextInt();
        System.out.println("Enter a second number : ");
        int number2=input.nextInt();
        obj.n1=number1;
        obj.n2=number2;

        System.out.println("Sum of " + obj.n1 + " and " + obj.n2 + " is " + obj.sum());

    }
}
