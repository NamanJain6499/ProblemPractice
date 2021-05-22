package InterviewBitPractice.GreedyProblems;

import java.util.ArrayList;
//solution
//https://www.geeksforgeeks.org/count-minimum-right-flips-to-set-all-values-in-an-array/
public class Bulbs {
    public static void main(String[] args) {
        Bulbs bulbs=new Bulbs();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(1);
        A.add(0);
        A.add(1);
        A.add(0);
        int answer=bulbs.solve(A);
        System.out.println(answer);
    }

    private int solve(ArrayList<Integer> A) {
        int count=0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)==0 && count%2==0){
                count++;
            }
            if(A.get(i)==0 && count%2!=0){
                continue;
            }
            if(A.get(i)==1 && count%2==0){
                continue;
            }
            if(A.get(i)==1 && count%2!=0){
                count++;
            }
        }
        return count;
    }
}
