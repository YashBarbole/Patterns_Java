package Two_Pointer;

import java.util.Arrays;

public class Two_sum_arr_sorted {
    public static void main(String[] args) {
        int arr[]={0,1,2,4};
        System.out.println(Arrays.toString(TwoSum(arr, 6)));
    }

    static int [] TwoSum(int arr[],int k){
        int n=arr.length;
        int i=0;
        int j=n-1;
        
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==k){
                return new int []{arr[i],arr[j]};
            }
            else if(sum>k){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }
}
