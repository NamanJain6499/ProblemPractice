package InterviewBitPractice.TwoPointer;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray remove=new RemoveDuplicatesFromSortedArray();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(1);
        A.add(1);
        A.add(5);
        A.add(5);
        A.add(8);
        int answer=remove.removeDuplicates(A);
        System.out.println(answer);
    }

    private int removeDuplicates(ArrayList<Integer> a) {
        int p1=0,p2=1;
        while(p2<a.size())
        {
            if(a.get(p1) == (a.get(p2)))
            {
                a.remove(p2);
            }
            else
            {
                p1++;
                p2++;
            }

        }
        return a.size();
    }
}
