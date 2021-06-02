package HackerRank;

import java.util.ArrayList;

public class fibbonaci {
    public static void main(String[] args) {
        int N=7;
        ArrayList<Integer> A=new ArrayList<>();
        A.add(fib(N));
        System.out.println(A);
    }

    private static int fib(int n) {
        if(n==0||n==1){
            return 0;
        }
        int a=0;
        int b=1;
        int sum=a+b;
        System.out.println(b);
        while (n>1){
            sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
            n--;
        }
        return sum;
    }
}
