package deneme;

import java.util.Scanner;

public class coding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        calsqr obj = new calsqr();
        obj.square();
        obj.getResult();
        */

        System.out.println("Enter the size of array: ");
        int n= input.nextInt();
        int [] userArray = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter the " + (i+1 )+ ".element: ");
            userArray[i]=input.nextInt();
        }
        sorting den = new sorting(n,userArray);


    }
}
