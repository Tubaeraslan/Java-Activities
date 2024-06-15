package oop;

public class simpleExample {
    int number;
    public int facto() {
        int i,facto=1;
        for (i=1;i<=number;i++){
            facto=facto*i;
        }
        return facto;
    }

    public boolean prime(){
        int i;
        boolean prime=true;
        for (i=2;i<number;i++){
            if (number%i==0){
                prime=false;
                break;
            }
        }
        return prime;
    }




}
