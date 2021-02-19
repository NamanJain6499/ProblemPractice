package InterviewBitPractice.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class SetMatrixZeros {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        matrix.add(new ArrayList<>());
        matrix.get(0).add(1);
        matrix.get(0).add(0);
        matrix.get(0).add(1);
        matrix.add(new ArrayList<>());
        matrix.get(1).add(1);
        matrix.get(1).add(1);
        matrix.get(1).add(1);
        matrix.add(new ArrayList<>());
        matrix.get(2).add(1);
        matrix.get(2).add(1);
        matrix.get(2).add(1);
        SetMatrixZeros zeros = new SetMatrixZeros();
        ArrayList<ArrayList<Integer>> convertedMatrix = new ArrayList<>();
        convertedMatrix = zeros.setZeros(matrix);
        System.out.println(convertedMatrix);
    }

    private ArrayList<ArrayList<Integer>> setZeros(ArrayList<ArrayList<Integer>> A) {
        //we have used hashset as if we get any row number in rowSet variable them complete row is set to 0 so no duplicates in Sets are taken.
        HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> colSet = new HashSet<>();
        for (int row = 0; row < A.size(); row++) {
            for (int col = 0; col < A.get(row).size(); col++) {
                if (A.get(row).get(col) == 0) {
                    rowSet.add(row);
                    colSet.add(col);
                }
            }
        }
        for (int row = 0; row < A.size(); row++) {
            for (int col = 0; col < A.get(row).size(); col++) {
                if (rowSet.contains(row) || colSet.contains(col)) {
                    A.get(row).set(col, 0);
                }
            }
        }
        return A;
    }
}
