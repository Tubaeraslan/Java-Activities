import java.util.Scanner;
public class odd {
    public static int[] numbers(int a, int b) {
        int n = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                n++;
            }
        }
        int nums [] = new int[n];

        int index=0;

        for (int i=a;i<=b;i++){
            if (i%2!=0){
                nums[index]=i;
                index++;
            }
        }


        return nums;

    }
    public static int sum(int [] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the start number: ");
        int start = input.nextInt();
        System.out.println("Enter the end number: ");
        int end = input.nextInt();

        int oddNumbers[]=numbers(start,end);
        int result=sum(oddNumbers);

        System.out.println(result);


    }
}
