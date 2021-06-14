package InterviewBitPractice.Hashing;

import java.util.HashMap;
import java.util.Map;

public class CheckPalindrome {
    public static void main(String[] args) {
       CheckPalindrome check=new CheckPalindrome();
       String A="abcde";
       int answer=check.solve(A);
       System.out.println(answer);
    }

    private int solve(String a) {
        HashMap<Character,Integer> map=new HashMap<>();
       for (int i=0;i<a.length();i++){
           if (map.containsKey(a.charAt(i))){
               char ch=a.charAt(i);
               map.put(ch,map.get(ch)+1);
           }else{
               map.put(a.charAt(i),1);
           }

       }

       for (char key:map.keySet()){
           int value=map.get(key);
           if(value%2!=0 && value !=1){
               return 0;
           }
       }
       return 1;

       }
}
