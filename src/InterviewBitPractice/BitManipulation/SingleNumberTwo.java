package InterviewBitPractice.BitManipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SingleNumberTwo {
    public static void main(String[] args) {
        SingleNumberTwo number = new SingleNumberTwo();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(0);
        A.add(0);
        A.add(0);
        A.add(1);
//        A.add(1);
//        A.add(2);
//        A.add(4);
//        A.add(3);
//        A.add(3);
//        A.add(2);
//        A.add(2);
//        A.add(3);
//        A.add(1);
//        A.add(1);
        int answer=number.solve(A);
        System.out.println(answer);

    }

    private int solve(ArrayList<Integer> A) {

        HashMap<Integer,Integer> map=new HashMap<>();

        for (int element:A){
            if(map.containsKey(element)){
                int temp=map.get(element);
                map.replace(element,temp+1);
            }else{
                map.put(element,1);
            }
        }
        int once=0;
        for (int key:map.keySet())  {
            if(map.get(key)==1)
                return key;
        }
        return -1;
    }
}
