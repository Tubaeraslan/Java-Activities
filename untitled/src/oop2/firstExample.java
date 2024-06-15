package oop2;

public class firstExample {
    int number;

    public int factoriel() {
       int i,facto=1;
       for (i=1;i<=number;i++){
           facto=facto*i;
       }
       return facto;
    }

    public boolean prime(){
        int i;
        boolean isPrime = true;
        for (i=2;i<number;i++){
            if (number%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }

}
