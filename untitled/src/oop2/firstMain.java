package oop2;

import java.util.Scanner;

public class firstMain {
    public static void main(String[] args) {
        firstExample obj = new firstExample();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        obj.number= input.nextInt();
        System.out.println("Factoriel of "+ obj.number + " is: " + obj.factoriel());
        if (obj.prime()){
            System.out.println("This number is prime");
        }
        else {
            System.out.println("This number is not prime");
        }
    }
}
