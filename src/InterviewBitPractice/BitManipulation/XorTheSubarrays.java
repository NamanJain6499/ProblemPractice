package InterviewBitPractice.BitManipulation;

import java.util.ArrayList;
//solution
//https://www.geeksforgeeks.org/xor-subarray-xors/
public class XorTheSubarrays {
    public static void main(String[] args) {
        XorTheSubarrays xor=new XorTheSubarrays();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(3);
        A.add(4);
        A.add(5);
        int answer=xor.solve(A);
        System.out.println(answer);
    }

    private int solve(ArrayList<Integer> A) {
        int res=0;
        int N=A.size();
        for (int i=0;i<A.size();i++){
            int freq=(i+1)*(N-i);
            if(freq%2!=0){
                res=res^A.get(i);
            }
        }
        return res;
    }
}
