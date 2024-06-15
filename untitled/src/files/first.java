package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        try{
            FileWriter fWrite = new FileWriter("grades.txt");
            BufferedWriter fOutput = new BufferedWriter(fWrite);
            Scanner input = new Scanner(System.in);
            char cont='y';
            int count=0;
            System.out.println("Enter the grade: ");

            do {
                String gr= input.nextLine();

                fOutput.write(gr);
                fOutput.newLine();
                System.out.println("Continue Y/N: ");
                cont=input.nextLine().charAt(0);
                count++;
            }
            while (cont=='y');

            System.out.println("You entered " + count + "grade");
            fOutput.close();
            fWrite.close();
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
