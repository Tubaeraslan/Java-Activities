package oop2;

import java.util.Scanner;

public class trying {
    int n;
    int result=1;
    trying(int number){
        this.n=number;
        facto();
    }

    public void facto(){
        for (int i=1;i<=n;i++){
            result*=i;
        }
        System.out.println(result);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= input.nextInt();

        trying obj = new trying(num);
    }

}


