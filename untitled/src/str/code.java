package str;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

public class code {
    String sentence;
    public code(String str){
        this.sentence=str;
    }

    public String upper() {
        return sentence.toUpperCase();
    }

    public String lower(){
        return sentence.toLowerCase();
    }
    public int len(){
        return sentence.length();
    }
    public char findIndex(int index){
        return sentence.charAt(index);
    }
    public String reversed(){
        char a[]= sentence.toCharArray();
        char rever[] = new char[sentence.length()];
        for (int i=0;i<sentence.length();i++){
           rever[i]=a[sentence.length()-i-1];
        }

        String newString = new String(rever);

        return newString;

    }

    public String[] breaking(){
        return sentence.split(",");
    }

    public boolean palindrome(){
        char arr[]=sentence.toCharArray();
        for (int i=0;i<sentence.length();i++){
            if (arr[i]!=arr[sentence.length()-1-i]){
                return false;
            }
        }
        return true;
    }

    public boolean anagram(String first,String second){
        if (first.length()!=second.length()){
            return false;
        }
        else {
            char[]firstChar=first.toCharArray();
            char[]secondChar=second.toCharArray();

            Arrays.sort(firstChar);
            Arrays.sort(secondChar);

            if (Arrays.equals(firstChar,secondChar)){
                return true;
            }
            else {
                return false;
            }

        }
    }

    public char mostRepeated(){
        String str = sentence.toLowerCase();
        Hashtable<Character,Integer> hashtable = new Hashtable<>();
        for (char i= 'a';i<='z';i++){
            hashtable.put(i,0);
        }

        char[]arr=str.toCharArray();

        for (char x : arr){
            if (hashtable.containsKey(x)){
                hashtable.put(x,hashtable.get(x)+1);
            }
        }
        int max=0;
        char most =' ';
        for (Map.Entry<Character,Integer> entry : hashtable.entrySet()){
            if (entry.getValue()>max){
                max= entry.getValue();
                most=entry.getKey();
            }
        }

        return most;

    }
}
