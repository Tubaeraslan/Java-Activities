package deneme;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Hashtable<String,Integer>hashtable= new Hashtable<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int num=input.nextInt();
        input.nextLine();

        try {
            FileWriter fWrite = new FileWriter("students.txt");
            BufferedWriter fOutput = new BufferedWriter(fWrite);

            for (int i=0;i<num;i++){
                System.out.println("Enter the name of student: ");
                String name = input.nextLine();
                System.out.println("Enter the grade of student: ");
                int grade= input.nextInt();
                input.nextLine();

                hashtable.put(name,grade);
                fOutput.write(name + " " + grade);
                fOutput.newLine();
            }

            fOutput.close();
            fWrite.close();


        }
        catch (IOException e ){
            e.printStackTrace();
            System.out.println(e);
        }


        int total =0;

        Enumeration<String>keys= hashtable.keys();

        while (keys.hasMoreElements()){
            String key = keys.nextElement();
            total+=hashtable.get(key);
            System.out.println("Key: " + key + " Value: " + hashtable.get(key));
        }

        int avrg= total/hashtable.size();
        System.out.println(avrg);

    }
}
