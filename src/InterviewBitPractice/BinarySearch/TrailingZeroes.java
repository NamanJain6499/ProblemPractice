package InterviewBitPractice.BinarySearch;

public class TrailingZeroes {
    public static void main(String args[]){
        TrailingZeroes zeros=new TrailingZeroes();
        int A=8;
        int answer=zeros.solve(A);
        System.out.println(answer);
    }

    private int solve(int A) {
        int count=0;
        int zero=0;
        while (A%2!=1){
            count++;
            A/=2;
        }
     return count;
    }

    }

