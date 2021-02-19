package InterviewBitPractice.ArrayList;

public class ReverseInteger {
    public static void main(String args[]){
        int A=-123;
        ReverseInteger rev=new ReverseInteger();
        int answer=ReverseInteger.reverse(A);
        System.out.println(answer);
    }

    private static int reverse(int A) {
        boolean neg = A < 0;
        A = Math.abs(A);
        long ret = 0;
        while(A != 0){
            ret = ret*10 + A%10;
            A = A/10;
        }
        if(ret > Integer.MAX_VALUE) return 0;
        return neg ? -(int)ret : (int)ret;
    }


}
