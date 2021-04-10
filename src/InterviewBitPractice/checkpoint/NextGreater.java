package InterviewBitPractice.checkpoint;

import java.util.ArrayList;

public class NextGreater {
    public static void main (String args[]){
        NextGreater greater=new NextGreater();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(3);
        A.add(2);
        A.add(1);
        //A.add(10);
        ArrayList<Integer> answer=greater.nextGreater(A);
        System.out.println(answer);
    }

    private ArrayList<Integer> nextGreater(ArrayList<Integer> A) {
        //Arraylist for next greater elements
        ArrayList<Integer> G=new ArrayList<>();
        for (int i=0;i<A.size();i++){
            int num=A.get(i);
            int greaterNum=isGreater(i+1,A.size()-1,num,A);
            G.add(i,greaterNum);
        }
        return G;
    }

    private int isGreater(int start, int end, int num,ArrayList<Integer> A) {
        for (int i=start;i<=end;i++){
            if (A.get(i)>num){
                return A.get(i);
            }

        }
        return -1;
    }
}
