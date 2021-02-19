package InterviewBitPractice.BinarySearch;

public class NumberOf1Bits {
    public static void main(String args[]){
        NumberOf1Bits numberOf1Bits=new NumberOf1Bits();
        long a=000000000000000011001001011;
        int answer=numberOf1Bits.solve(a);
        System.out.println(answer);

    }

    private int solve(long a) {
        int count=0;
        while(a!=0){
            if((a&1)==1){
                count++;
            }
            a=a>>1;//right shift operator by 1
        }
        return count;
    }
}
