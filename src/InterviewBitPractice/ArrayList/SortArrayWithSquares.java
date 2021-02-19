package InterviewBitPractice.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayWithSquares {
    public static void main(String args[]){
        ArrayList<Integer> A=new ArrayList<>();
        A.add(-6);
        A.add(-3);
        A.add(-1);
        A.add(2);
        A.add(4);
        A.add(5);
        SortArrayWithSquares sort=new SortArrayWithSquares();
        ArrayList<Integer> answer=sort.solve(A);
        System.out.println(answer);
    }

    private ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> temp=new ArrayList<>();
        int len=A.size();
        int start;
        for (int i=0;i<len;i++){
            temp.add(A.get(i)*A.get(i));
        }
        Collections.sort(temp);
        return temp;

        }

    }

