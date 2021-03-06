package InterviewBitPractice.checkpoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthSmallestElementintheArray {
    public static void main(String args[]){
        KthSmallestElementintheArray element=new KthSmallestElementintheArray();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(2);
        A.add(1);
        A.add(4);
        A.add(3);
        A.add(2);
        int k=3;
        int answer=element.solve(A,k);
        System.out.println(answer);
    }

    private int solve(ArrayList<Integer> A, int B) {
        List list = new ArrayList<>(A);
        Collections.sort(list);
        return (int)list.get(B-1);
    }
}
