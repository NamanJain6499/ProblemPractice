package InterviewBitPractice.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AnIncrementProblem {
    public static void main(String args[]){
        AnIncrementProblem problem=new AnIncrementProblem();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(1);
        A.add(1);
        ArrayList<Integer> answer=problem.solve(A);
        System.out.println(answer);
    }
    public ArrayList<Integer> solve(ArrayList<Integer> A){
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,A.get(0));
        for (int i=1;i<A.size();i++){
            if(map.containsValue(A.get(i))){
                int value= (int) getKeyFromValue(map, A.get(i));
                map.replace(value,A.get(i),A.get(i)+1);
                map.put(i,A.get(i));
            }else {
                map.put(i,A.get(i));
            }
        }
        ArrayList<Integer> result=new ArrayList<>();
        for (int i=0;i<map.size();i++){
            result.add(map.get(i));
        }
        return result;
    }
    public static Object getKeyFromValue(Map hm, Object value) {
        for (Object o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }

}
