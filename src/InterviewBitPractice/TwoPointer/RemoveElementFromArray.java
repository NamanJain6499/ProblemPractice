package InterviewBitPractice.TwoPointer;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        RemoveElementFromArray remove=new RemoveElementFromArray();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(4);
        A.add(1);
        A.add(1);
        A.add(2);
        A.add(1);
        A.add(3);
        int B=1;
        int answer=remove.solve(A,B);
        System.out.println(answer);
    }

    private int solve(ArrayList<Integer> A, int B) {
        int valid_size=0;
        for (int i=0;i<A.size();i++){
            if(A.get(i)!=B){
                A.set(valid_size,A.get(i));
                valid_size++;
            }
        }
        return valid_size;
    }
}
