package str;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence= input.nextLine();

        code obj = new code(sentence);

        System.out.println(obj.upper());
        System.out.println(obj.lower());
        System.out.println(obj.len());
        System.out.println(obj.findIndex(2));
        System.out.println(obj.reversed());

        String[] resultBreak = obj.breaking();
        for (int i=0;i<resultBreak.length;i++){
            System.out.println(resultBreak[i]);
        }

        System.out.println(obj.palindrome());
        System.out.println(obj.anagram("rac","car"));
        System.out.println(obj.mostRepeated());
    }
}
