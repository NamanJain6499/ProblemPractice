package InterviewBitPractice.BitManipulation;

public class ReverseBits {
    public static void main(String[] args) {
        ReverseBits reverseBits=new ReverseBits();
        long a=3;
        long answer=reverseBits.reverse(a);
        System.out.println(answer);
    }

    private long reverse(long a) {
        StringBuilder str = new StringBuilder();
        while(a>0){
            str.append(a%2);
            a=a/2;
        }
        long sum=0;
        int n=31;
        for (int i=0;i<str.length();i++){
            sum +=Math.pow(2,n)*(str.charAt(i)-'0');
            n--;
        }
        return sum;
    }
}
