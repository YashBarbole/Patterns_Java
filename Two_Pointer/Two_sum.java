package Two_Pointer;

public class Two_sum {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2};
        System.out.println(RemoveDuplicate(arr));
    }

    static int RemoveDuplicate(int arr[]){
        int i=0;
        if(arr.length==0){
            return 0;
        }
        for(int j=1;j<arr.length;j++){
            if (arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

    
}
