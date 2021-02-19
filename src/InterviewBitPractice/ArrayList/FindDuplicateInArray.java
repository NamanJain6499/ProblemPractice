package InterviewBitPractice.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDuplicateInArray {
    public static void main(String args[]){
        List<Integer> list=new ArrayList<Integer>();
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(4);
        list.add(1);
        FindDuplicateInArray duplicateInArray=new FindDuplicateInArray();
        int repeat=duplicateInArray.repeatedNumber(list);
        System.out.println(repeat);
    }

    public int repeatedNumber(List<Integer> list) {
        HashSet<Integer> duplicate=new HashSet<>();
        for (int i=0;i<list.size();i++){
            if(duplicate.contains(list.get(i))){
                return list.get(i);
            }
            duplicate.add(list.get(i));
            }
        return -1;
        }



}
