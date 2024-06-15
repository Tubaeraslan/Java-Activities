package hashtable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class mostLetter {
    public static void most(String str){
        Hashtable<Character,Integer>hashtable= new Hashtable<>();
        for (char i='a';i<='z';i++){
            hashtable.put(i,0);
        }

        String newSentence= str.toLowerCase();
        char[] arr= newSentence.toCharArray();

        for (int i=0;i<arr.length;i++){
            if (hashtable.containsKey(arr[i])){
                hashtable.put(arr[i],hashtable.get(arr[i])+1);
            }
        }


        char mostChar=' ';
        int max=0;

        for (char key: hashtable.keySet()){
            int count = hashtable.get(key);
            if (count>max){
                mostChar=key;
                max=count;
            }
        }

        System.out.println("The most letter is: "+mostChar);

        Enumeration<Character> keys= hashtable.keys();
        while (keys.hasMoreElements()){
            Character key = keys.nextElement();
            System.out.println("Key: " + key + " Value: " + hashtable.get(key));
        }

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();

        most(sentence);


    }
}
