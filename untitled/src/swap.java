import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter first number: ");
        int n1=input.nextInt();
        System.out.println("Enter second number: ");
        int n2=input.nextInt();

        System.out.println("Before swapping: " + n1 + " " + n2);

        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;

        System.out.println("After swapping: " + n1 + " " + n2);

    }
}
