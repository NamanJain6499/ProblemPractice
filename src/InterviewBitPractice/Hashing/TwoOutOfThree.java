package InterviewBitPractice.Hashing;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class TwoOutOfThree {
    public static void main(String args[]) {
        TwoOutOfThree outOfThree = new TwoOutOfThree();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        ArrayList<Integer> B = new ArrayList<>();
        B.add(1);
        B.add(3);
        ArrayList<Integer> C = new ArrayList<>();
        C.add(2);
        C.add(3);
        ArrayList<Integer> answer = outOfThree.solve(A, B, C);
        System.out.println(answer);
    }

    private ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        ArrayList<Integer> a = removeDuplicate(A);
        ArrayList<Integer> b = removeDuplicate(B);
        ArrayList<Integer> c = removeDuplicate(C);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.size(); i++) {
            if (map.containsKey(a.get(i))) {
                map.put(a.get(i), map.get(a.get(i)) + 1);
            } else {
                map.put(a.get(i), 1);
            }
        }
        for (int i = 0; i < b.size(); i++) {
            if (map.containsKey(b.get(i))) {
                map.put(b.get(i), map.get(b.get(i)) + 1);
            } else {
                map.put(b.get(i), 1);
            }
        }
        for (int i=0;i<c.size();i++){
            if (map.containsKey(c.get(i))){
                map.put(c.get(i),map.get(c.get(i))+1);
            }else {
                map.put(c.get(i),1);
            }

        }
        ArrayList<Integer> ans=new ArrayList<>();
        for (int element:map.keySet()){
            if (map.get(element)>1){
                ans.add(element);
            }
        }
        Collections.sort(ans);
        return ans;
    }
    private ArrayList<Integer> removeDuplicate(ArrayList<Integer> list) {
        HashSet<Integer> set=new HashSet<>(list);
        ArrayList<Integer> result = new ArrayList<>(set);
        return result;

    }
}