package deneme;

public class calsqr {
    int [] nums=new int[100];
    public void square(){
        for (int i=1;i<=100;i++){
            for (int k=1;k<=i;k++){
                if (k*k==i){
                    nums[k]=i;
                }
            }
        }
    }
    public void getResult(){
        for (int i=0;i<=nums.length;i++){
            if (nums[i]!=0){
                System.out.println(nums[i]);
            }
        }
    }
}
