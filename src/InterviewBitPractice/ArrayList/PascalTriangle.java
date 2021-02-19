package InterviewBitPractice.ArrayList;

import java.util.ArrayList;

public class PascalTriangle {
    //https://www.interviewbit.com/problems/pascal-triangle/
    public static void main(String args[]) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        answer = pascalTriangle.solve(5);
        System.out.println(answer);
    }

    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        if (A == 0) {
            return arrayList;
        }
        for (int i = 0; i < A; i++) {
            arrayList.add(new ArrayList<>());
        }
        if (A == 1) {
            arrayList.get(0).add(1);
            return arrayList;
        }
        arrayList.get(0).add(1);
        arrayList.get(1).add(1);
        arrayList.get(1).add(1);
        for (int i = 2; i < A; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arrayList.get(i).add(1);
                } else {
                    arrayList.get(i).add(arrayList.get(i - 1).get(j) + arrayList.get(i - 1).get(j - 1));
                }
            }
        }
        return arrayList;

    }
}
