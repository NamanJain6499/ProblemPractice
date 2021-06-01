package InterviewBitPractice.TwoPointer;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray remove=new RemoveDuplicatesFromSortedArray();
        ArrayList<Integer> A=new ArrayList<>();
      A.add(5000);
      A.add(5000);
      A.add(5000);

        int answer=remove.removeDuplicates(A);
        System.out.println(answer);
    }

    private int removeDuplicates(ArrayList<Integer> a) {
        int i=0;
        int j=1;
        if(a.size()==0||a.size()==1){
            return a.size();
        }
        for (i=0;i<a.size();i++){
            if (a.get(i).equals(a.get(j))){
                a.remove(j);
            }else{
                i++;
                j++;
            }

        }
        System.out.println(a);
        return a.size();
    }
}
