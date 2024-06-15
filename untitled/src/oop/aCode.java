package oop;

import java.util.Scanner;

public class aCode {
    public static void main(String[] args) {
        simpleExample first = new simpleExample();
        first.number=5;
        System.out.println("Factoriel of " + first.number +" is " + first.facto());
        if (first.prime()){
            System.out.println(first.number + " is prime number");
        }
        else {
            System.out.println(first.number + " is prime number");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integer: ");
        int num1=input.nextInt();
        int num2=input.nextInt();

        sumTwoInteger obj = new sumTwoInteger(num1,num2);
        int result = obj.getSum();
        System.out.println("The sum is: " + result);

    }
}
