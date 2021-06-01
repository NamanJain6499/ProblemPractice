package InterviewBitPractice.TwoPointer;

import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        MergeTwoSortedList sorted=new MergeTwoSortedList();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(5);
        A.add(8);

        ArrayList<Integer> B = new ArrayList<>();
        B.add(6);
        B.add(9);

        ArrayList<Integer> answer=sorted.merge(A,B);
        System.out.println(answer);


    }

    private ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int n=a.size();
        int m=b.size();
        int i=0;
        int j=0;
        while (i<n && j<m){
            if(a.get(i)<b.get(j)){
                i++;
            }else {
                if(i<n){
                    int temp=a.get(i);
                    a.set(i,b.get(j));
                    b.set(j,temp);
                    i++;
                    Collections.sort(b);
                }else{
                    a.add(b.get(j));
                    j++;
                }
            }
        }
        while (j<m){
            a.add(b.get(j));
            j++;
        }

        return a;
    }
}
