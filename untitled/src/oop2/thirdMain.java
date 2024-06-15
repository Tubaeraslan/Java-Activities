package oop2;

import java.util.Scanner;

public class thirdMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three digit : ");
        int n1= input.nextInt();
        int n2= input.nextInt();
        int n3= input.nextInt();

        thirdExample obj = new thirdExample(n1,n2,n3);
        obj.results();
    }
}
