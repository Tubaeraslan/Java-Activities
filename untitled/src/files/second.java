package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        try {
            FileWriter fWrite = new FileWriter("class.txt");
            BufferedWriter fOutput= new BufferedWriter(fWrite);
            Scanner input = new Scanner(System.in);
            char cont = 'y';
            int count=0;
            int sum=0;

            System.out.println("Enter the grade: ");
            do {
                int grd= input.nextInt();
                fOutput.write(grd);
                fOutput.newLine();
                System.out.println("Continue: y/n ");
                cont=input.next().charAt(0);
                count++;
                sum+=grd;
            }while (cont=='y');

            int avrg = sum/count;
            System.out.println("You entered " + count + " grade");
            System.out.println("The average of the class: " + avrg);
            fOutput.close();
            fWrite.close();
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println(e);
        }

    }
}
