package hashtable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class secondExample {
    public static void main(String[] args) {
        Hashtable<String,Integer>ht = new Hashtable<>();
        ht.put("ali",100);
        ht.put("harun",102);
        ht.put("ayse",101);
        ht.put("ramiz",103);


        Enumeration<String>keys=ht.keys();

        while (keys.hasMoreElements()){
            String key = keys.nextElement();
            System.out.println("Key: "+key +" Value: " + ht.get(key));
        }

    }
}
