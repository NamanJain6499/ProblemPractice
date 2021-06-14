package InterviewBitPractice.ArrayList;

import java.util.ArrayList;

public class BalanceArray {
    public static void main(String[] args) {
        BalanceArray balanceArray=new BalanceArray();
        ArrayList<Integer> A=new ArrayList<>();
       // A : [ 7, 2, 5, 3, 4, 3, 3, 2 ]
        A.add(7);
        A.add(2);
        A.add(5);
        A.add(3);
        A.add(4);
        A.add(3);A.add(3);
        A.add(2);

        int answer=balanceArray.solve(A);
        System.out.println(answer);
    }

    private int solve(ArrayList<Integer> A) {
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<A.size();i++){
            Integer astr = new Integer(A.get(i));
            sb.append(astr);
        }
        StringBuilder f=new StringBuilder(sb);
        for(int i=0;i<A.size();i++){
            sb.deleteCharAt(i);
            int num=Integer.parseInt(sb.toString());

            if(num%11==0){
                count+=1;
            }
            sb.delete(0,sb.length());
            sb.append(f);
        }

        return count;
    }
}
