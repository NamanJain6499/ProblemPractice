package InterviewBitPractice.ArrayList;

public class GCD {
    public static void main(String args[]){
        int a=10,b=15;
        GCD parameter=new GCD();
        int c=parameter.gcd(a,b);
        System.out.println(c);
    }

    private int gcd(int A, int B) {
        if(B==0){
            return A;

        }
        return gcd(B,A%B);
    }
}
