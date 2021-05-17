package InterviewBitPractice.GreedyProblems;

import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        MajorityElement majorityElement=new MajorityElement();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(2);
        A.add(1);
        A.add(2);
        int answer=majorityElement.solve(A);
        System.out.println(answer);
    }

    private int solve(ArrayList<Integer> A) {
        int n=A.size()/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int element:A){
            if (map.containsKey(element)){
                map.put(element,map.get(element)+1);
            }
            else {
                map.put(element,1);
            }
        }
        int majorityElement = 0;
        for (int key: map.keySet()){
            if(map.get(key)>n){
                majorityElement=key;
                break;
            }
        }
        return majorityElement;
    }
}
