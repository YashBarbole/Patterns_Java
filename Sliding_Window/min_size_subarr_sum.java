package Sliding_Window;

public class min_size_subarr_sum {
    public static void main(String[] args) {
        int arr[]={2,3,1,2,4,3};
        System.out.println(MinSizeSubarr(arr, 7));
    }   

    static int MinSizeSubarr(int arr[],int k){
        int l=0,h=0,res=Integer.MAX_VALUE;
        int sum=0;
        while(h<arr.length){
             sum+=arr[h];
            while(sum>=k){
                int len=h-l+1;
                res=Math.min(res, len);
                sum=sum-arr[l];
                l++;
            }
            h++;
        }
        return res;
    }
}
