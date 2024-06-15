package deneme;

public class sorting {
    int n;
    int [] numbers = new int[100];
    public sorting(int size,int[] arr){
        this.n=size;
        this.numbers=arr;
        sort();
    }
    public void sort(){
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if (numbers[j]<numbers[i]){
                    int temp = numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }

}
