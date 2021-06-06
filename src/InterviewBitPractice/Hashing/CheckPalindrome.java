package InterviewBitPractice.Hashing;

import java.util.HashMap;

public class CheckPalindrome {
    public static void main(String[] args) {
//        CheckPalindrome check=new CheckPalindrome();
//        String A="abbaee";
//        int answer=check.solve(A);
//        System.out.println(answer);

        String name1="aakash";
        String name2=new String("aakash");
        String name3 = String.valueOf("aakash");
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1==name3);

    }

    private int solve(String a) {
        HashMap<Character,Integer> map=new HashMap<>();
       for (int i=0;i<a.length();i++){
           if (map.containsKey(a.charAt(i))){
               map.put(a.charAt(i),map.get(a.charAt(i))+1);
           }
           map.put(a.charAt(i),i);
       }
       return 0;

       }
}
