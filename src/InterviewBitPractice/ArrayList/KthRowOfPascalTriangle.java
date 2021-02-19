package InterviewBitPractice.ArrayList;

import java.util.ArrayList;

public class KthRowOfPascalTriangle {

    //https://www.interviewbit.com/problems/kth-row-of-pascals-triangle/
    public static void main(String args[]){
        int k=4;
       KthRowOfPascalTriangle kthRowOfPascalTriangle=new KthRowOfPascalTriangle();
        System.out.println(kthRowOfPascalTriangle.solve(2));
    }

    private ArrayList<Integer> solve(int A) {

        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        for (int i = 0; i <= A; i++) {
            arrayList.add(new ArrayList<>());
        }
        if (A == 0) {
            arrayList.get(0).add(1);
            return arrayList.get(A);
        }

        if (A == 1) {
            arrayList.get(0).add(1);
            arrayList.get(1).add(1);
            arrayList.get(1).add(1);
            return arrayList.get(A);
        }
        arrayList.get(0).add(1);
        arrayList.get(1).add(1);
        arrayList.get(1).add(1);
        for (int i = 2; i <= A; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arrayList.get(i).add(1);
                } else {
                    arrayList.get(i).add(arrayList.get(i - 1).get(j) + arrayList.get(i - 1).get(j - 1));
                }
            }
        }
        return arrayList.get(A);
    }


}
