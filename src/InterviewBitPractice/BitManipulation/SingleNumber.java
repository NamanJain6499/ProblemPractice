package InterviewBitPractice.BitManipulation;

import java.util.ArrayList;
import java.util.Collections;

public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber singleNumber=new SingleNumber();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(2);
        A.add(3);
        A.add(1);
        int answer=singleNumber.solve(A);
        System.out.println(answer);

    }

    private int solve(ArrayList<Integer> A) {
        int result=0;
        for (int i=0;i<A.size();i++){
           result ^=A.get(i);
        }
        return result;
    }
}
