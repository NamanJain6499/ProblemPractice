package InterviewBitPractice.TwoPointer;

import java.util.ArrayList;

public class SortbyColor {
    public static void main(String[] args) {
        SortbyColor sort=new SortbyColor();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(0);
        A.add(1);
        A.add(2);
        A.add(0);
        A.add(1);
        A.add(2);
        ArrayList<Integer> res=sort.solve(A);
        System.out.println(res);

    }

    private ArrayList<Integer> solve(ArrayList<Integer> a) {
        //[0,1,2,0,1,2]
        int start=0;
        int end=a.size()-1;
        int index=0;
        while(start<end && index<=end){
            if(a.get(index)==0){
                int temp=a.get(start);
                a.set(start,a.get(index));
                a.set(index,temp);
                start++;
                index++;
            }else if(a.get(index)==2){
                int temp=a.get(end);
                a.set(end,a.get(index));
                a.set(index,temp);
                end--;
            }else{
                index++;
            }
        }
        return a;

    }
}
