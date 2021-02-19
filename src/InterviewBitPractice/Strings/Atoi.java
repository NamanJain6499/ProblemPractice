package InterviewBitPractice.Strings;

public class Atoi {
    public static void main(String args[]){
        String A="+7";
        Atoi atoi=new Atoi();
        int answer=atoi.solve(A);
        System.out.println(answer);
    }

    private int solve(String A) {
        int start=0;
        int negative=0;
        long num = 0;
        long bound=Integer.MAX_VALUE;
        bound=bound+2;
        while (A.charAt(start)==' '){
            start++;
        }
        if (A.charAt(start)=='-'){
            start++;
            negative=1;
        }
        if (A.charAt(start)=='+'){
            start++;
        }
        for (int i=start;i<A.length();i++){
            char c=A.charAt(i);
            if (c>='0' && c<='9'){
                num=num*10+ (int)(c-'0');
                if (num>bound){
                    break;
                }
            }else
                break;

        }
        if (negative==1){
            num=num*(-1);
            if (num<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }else
                return (int) num;
        }else
            if (num>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else
                return (int)num;
    }
}
