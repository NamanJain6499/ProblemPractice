package InterviewBitPractice.DynamicProgramming;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class SmallestSequenceWithGivenPrimes {
    public static void main(String[] args) {
        SmallestSequenceWithGivenPrimes prime=new SmallestSequenceWithGivenPrimes();
        int A=2;
        int B=3;
        int C=5;
        int D=5;
        ArrayList<Integer> result=prime.solve(A,B,C,D);
        System.out.println(result);

    }
//priority queue has a property that smallest element has higher priority hence it will be deleted first.
    private ArrayList<Integer> solve(int A, int B, int C, int D) {
        ArrayList<Integer> res=new ArrayList<>();

        PriorityQueue<Integer> q=new PriorityQueue<>();
        q.add(A);
        q.add(B);
        q.add(C);

        while(!q.isEmpty() && D>0){
            int temp=q.poll();

            res.add(temp);
            D--;

            q.add(temp*A);
            q.add(temp*B);
            q.add(temp*C);

        }

        return res;

    }
}
