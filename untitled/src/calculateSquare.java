public class calculateSquare {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            for (int k=1;k<=i;k++){
                if (k*k==i){
                    System.out.println(i);
                }
            }
        }
    }
}
