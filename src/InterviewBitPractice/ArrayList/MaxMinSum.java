package InterviewBitPractice.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MaxMinSum {
    public static void main(String args[]){
        ArrayList<Integer> A=new ArrayList<>();
        A.add(-2);
        A.add(1);
        A.add(-4);
        A.add(5);
        A.add(3);
        MaxMinSum sum=new MaxMinSum();
        int answer=sum.solve(A);
        System.out.println(answer);
    }

    private int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        return A.get(0)+A.get(A.size()-1);
    }
}
