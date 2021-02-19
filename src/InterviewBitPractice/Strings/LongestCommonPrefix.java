package InterviewBitPractice.Strings;

import java.util.ArrayList;

public class LongestCommonPrefix {
    public static void main(String args[]){
        ArrayList<String> A=new ArrayList<>();
        A.add("abcd");
        A.add("abcd");
        A.add("efgh");
        LongestCommonPrefix prefix=new LongestCommonPrefix();
        String common=prefix.longestCommonPrefix(A);
        System.out.println(common);
    }

    private String longestCommonPrefix(ArrayList<String> A) {
        if(A.size()==1)
            return A.get(0);
        int n=A.size();
        int minlen=Integer.MAX_VALUE;

        for (int i=0;i<n-1;i++){
            String s1=A.get(i);
            String s2=A.get(i+1);
            int j=0;

            int m=Math.min(s1.length(),s2.length());
            while (j<m && s1.charAt(j)==s2.charAt(j)){
                j++;
            }
            minlen=Math.min(minlen,j);
        }
        String prefix=(A.get(0)).substring(0,minlen);
        return prefix;
    }
}