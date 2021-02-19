package InterviewBitPractice.ArrayList;

import java.util.ArrayList;

public class AddOneToNumber {
    public static void main(String args[]){
        AddOneToNumber addOne=new AddOneToNumber();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(0);
        A.add(0);
        A.add(9);
        A.add(9);
        A.add(9);
        ArrayList<Integer> answer=new ArrayList<>();
        answer=addOne.plusOne(A);
        System.out.println(answer);
    }

    private ArrayList<Integer> plusOne(ArrayList<Integer> A) {

        int n=A.size();
        int i=n-1;
        A.set(i,A.get(i)+1);
        int carry=A.get(i)/10;
        A.set(i,A.get(i)%10);
        for (i=n-2;i>=0;i--){
            if (carry==1){

                A.set(i,A.get(i)+1);
                carry=A.get(i)/10;
                A.set(i,A.get(i)%10);

            }
        }
        if (carry==1){
            A.add(0,1);
        }
        while (A.get(0)==0)
            A.remove(0);
        return A;

    }


}
