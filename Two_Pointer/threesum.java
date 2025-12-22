package Two_Pointer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum{
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        System.out.println(threesum(arr));
    }
    
    static List<List<Integer>> threesum(int arr[]){
        List<List<Integer>> res= new ArrayList<>();
        int n=arr.length;
        if(n<3) return res;

        Arrays.sort(arr);

        for(int i=0;i<n-2;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            if(arr[i]>0) break;

            int l=i+1,r=n-1,t=-arr[i];

            while(l<r){
                int sum=arr[l]+arr[r];
                if(sum==t){
                    res.add(Arrays.asList(arr[i],arr[l],arr[r]));
                    l++;
                    r--;

                    while(l<r&& arr[l]==arr[l-1]) l++;
                    while(l<r&& arr[r]==arr[r+1])r--;

                }

                else if(sum<t){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return res;

    }
}