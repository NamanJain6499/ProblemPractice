package InterviewBitPractice.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class NobelInteger {
    public static void main(String args[]){
        ArrayList<Integer> A=new ArrayList<>();
        A.add(1);
        A.add(1);
        A.add(3);
        A.add(3);
        NobelInteger integer=new NobelInteger();
        int answer=integer.solve(A);
        System.out.println(answer);
    }

    private int solve(ArrayList<Integer> A) {

        Collections.sort(A);
        if(A.get(A.size()-1)==0){
            return 1;
        }
        for (int i=0;i<A.size();i++){
            int p=A.get(i);
            int greaterThanP=A.size()-i-1;
            if(p==greaterThanP && p!=A.get(i+1)){
                return 1;
            }
        }
        return -1;
    }
}
