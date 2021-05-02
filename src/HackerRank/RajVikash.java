package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class RajVikash {
    public static void main(String args[]){
        RajVikash rajVikash=new RajVikash();
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayList<Integer> A=new ArrayList<>();
        for (int i=0;i<n;i++){
            A.add(scanner.nextInt());
        }
        ArrayList<ArrayList<Integer>> answer=rajVikash.subsets(A);
        answer.remove(0);
        HashSet<Integer> set=new HashSet<>();
       for (int i=0;i<answer.size();i++){

       }
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
