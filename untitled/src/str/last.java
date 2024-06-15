package str;

public class last {
    public static void main(String[] args) {
        String s1="Ali and Ayşe had coffee and water by hand";
        char[]sentence=s1.toCharArray();
        int k= sentence.length;
        int count =0;

        for (int i=0;i<k;i++){
            if (sentence[i]=='a'){
                if (sentence[i+1]=='n'){
                    if (sentence[i+2]=='d'){
                        if (sentence[i-1]==' ' && sentence[i+3]==' '){
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println("Number of and is: "+count);


        String look = "and";

        if (s1.contains(look)) {
            System.out.println("true");
        }

        String newSentence= new String();

        String[]charToRemove= {"a","e"};
        for (String x:charToRemove){
            if (s1.contains(x)){
                newSentence=s1.replaceAll(x,"");
            }
        }
        System.out.println(newSentence);


        String sen = "Tuba and Vedat love each other and they will marry";
        int position = 0;
        int cnt=0;

        while (position!=-1){
            position=sen.indexOf("and",position);
            if (position != -1) {
                cnt++; // Increment the count if "and" is found
                position += "and".length(); // Move past the current occurrence of "and"
            }
        }

        System.out.println(cnt);


    }
}
