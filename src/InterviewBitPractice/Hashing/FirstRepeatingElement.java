package InterviewBitPractice.Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class FirstRepeatingElement {
    public static void main(String args[]){
        //A = [10, 5, 3, 4, 3, 5, 6]
        FirstRepeatingElement repeatingElement=new FirstRepeatingElement();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(6);
        A.add(10);
        A.add(5);
        A.add(4);
        A.add(9);
        A.add(120);
        A.add(6);
        int answer=repeatingElement.solve(A);
        System.out.println(answer);
    }

    private int solve(ArrayList<Integer> A) {
        int smallestIndex=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for (int i=0;i<A.size();i++){
            if (map.containsKey(A.get(i))){
                int index= map.get(A.get(i));
                if (index<smallestIndex) {
                    smallestIndex = index;
                }
            }else {
                map.put(A.get(i),i);
            }
        }
        if (smallestIndex>=0&&smallestIndex<A.size()){
            return A.get(smallestIndex);
        }
        return -1;
    }
}
