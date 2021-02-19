package InterviewBitPractice.ArrayList;

public class PalindromeInteger {
    public static void main(String args[]){
        PalindromeInteger integer=new PalindromeInteger();
        int A=12121;
        int answer =integer.solve(A);
        System.out.println(answer);

    }

    private int solve(int A) {
        int rev = 0,temp=A;
        while(A>0){
            rev=A%10+rev*10;
            A/=10;

        }
        if(rev==temp){
            return 1;
        }
        return 0;
    }
}
