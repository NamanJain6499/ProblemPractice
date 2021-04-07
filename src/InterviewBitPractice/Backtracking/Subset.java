package InterviewBitPractice.Backtracking;

import java.util.ArrayList;
import java.util.Collections;
//Concept from here
//https://www.youtube.com/watch?v=taIvqOIT3cM&t=688s
public class Subset {
    public static void main(String args[]) {
        Subset subset = new Subset();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        ArrayList<ArrayList<Integer>> answer=subset.subsets(A);
        System.out.println(answer);
    }

    private ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
        output.add(new ArrayList<Integer>());
        if (a.size() == 0)
            return output;
        Collections.sort(a);
        generate(a, output, new ArrayList<Integer>(), 0);
        return output;
    }
    public void generate(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> output, ArrayList<Integer> temp, int index)
    {
        for (int i = index; i < a.size(); i++)
        {
            temp.add(a.get(i));
            output.add(new ArrayList<Integer>(temp));
            generate(a, output, temp, i+1);
            temp.remove(temp.size() - 1);
        }
    }
}
