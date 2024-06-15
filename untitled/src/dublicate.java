import java.util.Scanner;

public class dublicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array: ");
        n=input.nextInt();

        int[] array = new int[n];

        for (int i=0;i<n;i++){
            System.out.println("Enter the " + (i+1) + ". element: ");
            array[i]=input.nextInt();
        }

        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (array[j]<array[i]){
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }

        System.out.println("Sorted array: ");
        for (int i=0;i<n;i++){
            System.out.println(array[i]);
        }

    }
}
