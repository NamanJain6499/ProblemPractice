package InterviewBitPractice.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class WaveArray {
    public static void main(String args[]){
        WaveArray array=new WaveArray();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A=array.wave(A);
        System.out.println(A);
    }

    private ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        for (int i=0;i<A.size()-1;i++){
            int temp;
            temp=A.get(i);
            A.set(i,A.get(i+1));
            A.set(i+1,temp);
            i++;
        }
        return A;

    }
}
