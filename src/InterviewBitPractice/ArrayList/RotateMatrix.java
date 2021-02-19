package InterviewBitPractice.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class RotateMatrix {

    //https://www.interviewbit.com/problems/rotate-matrix/
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
        A.add(new ArrayList<Integer>());
        A.get(0).add(1);
        A.get(0).add(2);
        A.get(0).add(3);
        A.add(new ArrayList<Integer>());
        A.get(1).add(4);
        A.get(1).add(5);
        A.get(1).add(6);
        A.add(new ArrayList<Integer>());
        A.get(2).add(7);
        A.get(2).add(8);
        A.get(2).add(9);
        RotateMatrix rotateMatrix = new RotateMatrix();
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        answer = rotateMatrix.rotate(A);
        System.out.println(answer);

    }

    public ArrayList<ArrayList<Integer>> rotate(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();
        //First reverse array then take transpose
        //while taking transpose diagonal element remain same only element at position i,j are swapped with element at j,i
        // hence loops are running only for half portion of matrix below diagonal and swapped with upper half portion of matrix.
        Collections.reverse(a);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = a.get(i).get(j);
                a.get(i).set(j, a.get(j).get(i));
                a.get(j).set(i, temp);


            }

        }
        return a;
    }
}
