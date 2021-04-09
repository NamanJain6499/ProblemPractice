package InterviewBitPractice.Backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetsII {
    public static void main(String args[]){
        SubsetsII subsetsII=new SubsetsII();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(2);
        ArrayList<ArrayList<Integer>> answer=subsetsII.subsetsWithDup(A);
        System.out.println(answer);
    }
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A){
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        result.add(new ArrayList<Integer>());

        if (A==null||A.size()==0){
            return result;
        }
        Collections.sort(A);
        generate(0,new ArrayList<Integer>(),A,result);
        return result;

    }

    private void generate(int start, ArrayList<Integer> list, ArrayList<Integer> A,ArrayList<ArrayList<Integer>> result) {
        for (int i = start; i < A.size(); i++)
        {
            if (i==start || A.get(i)!=A.get(i-1)) {
                list.add(A.get(i));
                result.add(new ArrayList<Integer>(list));
                generate(i + 1, list, A, result);
                list.remove(list.size() - 1);
            }
        }
    }
}
