package InterviewBitPractice.Hashing;

import java.util.ArrayList;
import java.util.List;

public class DiffkII {
    public  static void main(String args[]){
        DiffkII diffk=new DiffkII();
        List<Integer> A=new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        int B=2;
        int answer=diffk.diffPossible(A,B);
        System.out.println(answer);
    }
    private int diffPossible(final List<Integer> A,int k){
        int sub=0;
        int len=A.size();
        List<Integer> mapDifference = new ArrayList<Integer>();
        for (int i=0;i<len;i++){
            for (int j=i+1;j<len;j++){
                sub=A.get(i)-A.get(j);
                if (Math.abs(sub)==k){
                    return 1;
                }
            }
        }
        return 0;
    }
}
