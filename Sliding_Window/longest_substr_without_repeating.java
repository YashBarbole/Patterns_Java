package Sliding_Window;

import java.util.HashSet;

public class longest_substr_without_repeating {
 public static void main(String[] args) {
    

 }  
 
 static int Longest(String s){
    HashSet<Character> set= new HashSet<>();
    int l=0;
   
    int maxlen=0;
    for(int h=0;h<s.length();h++){
        char ch= s.charAt(h);
        while(set.contains(ch)){
            set.remove(s.charAt(l));
            l++;
        }

        set.add(ch);
        int len=h-l+1;
         maxlen= Math.max(maxlen, len);
    }
    return maxlen;
 }
}
