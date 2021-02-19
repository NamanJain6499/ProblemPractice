package InterviewBitPractice.BinarySearch;

import java.util.ArrayList;

public class MatrixSearch {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
        A.add(new ArrayList<>());
        A.get(0).add(1);
        A.get(0).add(3);
        A.get(0).add(5);
        A.get(0).add(7);
        A.add(new ArrayList<>());
        A.get(1).add(10);
        A.get(1).add(11);
        A.get(1).add(16);
        A.get(1).add(20);
        A.add(new ArrayList<>());
        A.get(2).add(23);
        A.get(2).add(30);
        A.get(2).add(34);
        A.get(2).add(50);
        int B = 0;
        MatrixSearch search = new MatrixSearch();
        int answer = search.solve(A,B);
        System.out.println(answer);

    }

    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int row=A.size();
        int col=A.get(0).size();
        int rowindex = -1;
        int number=0;

        for (int i=0;i<row;i++){
            if (B<=A.get(i).get(col-1)){
                rowindex=i;
                break;
            }
        }
        if (rowindex>=0 && rowindex<row){
            number=Binary(A,rowindex,0,col-1,B);
            return number;
        }

        return 0;
    }

    public int Binary(ArrayList<ArrayList<Integer>> A, int row, int start, int end,int B) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (A.get(row).get(mid) > B) {
                end = mid - 1;
            } else if (A.get(row).get(mid) == B) {
                return 1;
            } else {
                start = mid + 1;
            }
        }

        return 0;
    }
}



