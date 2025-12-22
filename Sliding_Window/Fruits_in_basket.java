package Sliding_Window;

import java.util.HashMap;

public class Fruits_in_basket {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        System.out.println(Fruits(arr));
    }

    static int Fruits(int arr[]){
        HashMap<Integer,Integer>mp=new HashMap<>();
        int l=0;
        int n=arr.length;
        int res=0;
        for(int h=0;h<n;h++){
            mp.put(arr[h],mp.getOrDefault(arr[h],0)+1);

            while(mp.size()>2){
                mp.put(arr[l],mp.get(arr[l])-1);
                if(mp.get(arr[l])==0){
                        mp.remove(arr[l]);
                }
                l++;
            }
            int len=h-l+1;
            res=Math.max(res,len);

        }   
        return res;

    }
}
