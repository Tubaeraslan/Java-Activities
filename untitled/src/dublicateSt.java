import java.util.Scanner;

public class dublicateSt {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence=input.nextLine();

        char[] array= sentence.toCharArray();

        for (int i=0;i<sentence.length();i++){
            for (int k=i+1;k<sentence.length()-1;k++){
                if (array[i]==array[k]){
                    
                }
            }
        }
    }
}
