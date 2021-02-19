package InterviewBitPractice.Strings;

import java.util.Locale;

public class AmazingSubarrays {
    public static void main(String args[]){
        String A="hbg";
        AmazingSubarrays amazingSubarrays=new AmazingSubarrays();
        int answer=amazingSubarrays.solve(A);
        System.out.println(answer);
    }

    private int solve(String A) {
        String a=A.toLowerCase(Locale.ROOT);
        int count=0;
        for (int i=0;i<a.length();i++){
            if (a.charAt(i)=='a'||a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u'){
                count+=A.length()-i;
            }
        }
        int N = count % 10003;
        return N;
    }
}
