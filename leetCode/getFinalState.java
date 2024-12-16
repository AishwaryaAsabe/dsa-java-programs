import java.util.Arrays;

public class getFinalState{
    public static int[] getFinalS(int []nums , int k , int multiplier){
        for(int i=0;i<k;i++){
          int minI=0;
          for(int j=0;j<nums.length;j++){
            if(nums[j]<nums[minI]){
             minI=j;
            }
          }

          nums[minI]*=multiplier;
        }

        return nums;
    }

    public static void main(String[] args) {
        int nums[]={2,3,4,5,6};
 int[] result = getFinalS(nums, 5, 2);
        System.out.println(Arrays.toString(result));        
    }
}