package InterviewBitPractice.ArrayList;

import java.util.ArrayList;

public class AntiDiagonal {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<ArrayList<Integer>>();
        matrix.add(new ArrayList<Integer>());
        matrix.get(0).add(1);matrix.get(0).add(2);matrix.get(0).add(3);
        matrix.add(new ArrayList<Integer>());
        matrix.get(1).add(4);matrix.get(1).add(5);matrix.get(1).add(6);
        matrix.add(new ArrayList<Integer>());
        matrix.get(2).add(7);matrix.get(2).add(8);matrix.get(2).add(9);
        AntiDiagonal diagonal=new AntiDiagonal();
        ArrayList<ArrayList<Integer>> answer=new ArrayList<ArrayList<Integer>>();
        answer=diagonal.solve(matrix);
        System.out.println(answer);
    }

    private ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int n=A.size();
        ArrayList<ArrayList<Integer>> B=new ArrayList<ArrayList<Integer>>();
        //if n=3 then 2*3-1=5 diagonals are there.
        //1 2 3
        //4 5 6
        //7 8 9
        for (int i=0;i<2*n-1;i++){
            B.add(new ArrayList<Integer>());
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                B.get(i+j).add(A.get(i).get(j));
            }
        }
        return B;
    }
}
