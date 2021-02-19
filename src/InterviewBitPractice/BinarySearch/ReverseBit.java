package InterviewBitPractice.BinarySearch;

public class ReverseBit {
    public static void  main(String args[]){
        ReverseBit rev=new ReverseBit();
        int A=3;
        long answer=rev.rev(A);
        System.out.println(answer);
    }

    private long rev(long a) {
        long b = 0L;
        for(int i = 31; i >=0; i--){
            // In java it is always a good practice to suffice long values with L. Here it is mandatory for << operator to work as expected.
            if((a & 1L<<i) != 0){
                b = b | 1L<<(31-i);
            }
        }
        return b;

    }
}
