package InterviewBitPractice.Math;

public class TrailingZerosinFactorial {
    public static void main(String[] args) {
        int A=124;
        TrailingZerosinFactorial zeros=new TrailingZerosinFactorial();
        int answer=zeros.solve(A);
        System.out.println(answer);
    }

    private int solve(int a) {
        int count=0;
        while(a>0){
            count=count+a/5;
            a=a/5;
        }
        return count;
    }


//    public int trailingZeroes(int A) {
//        int num=fact(A);
//        int count=0;
//        while(num>0){
//            if(num%10==0){
//                count++;
//            }
//            num/=10;
//        }
//        return count;
//
//    }
//    public int fact(int A){
//        if(A==1){
//            return 1;
//        }
//        int n=A*fact(A-1);
//        return n;
//    }
}
