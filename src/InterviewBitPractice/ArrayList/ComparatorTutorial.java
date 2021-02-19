package InterviewBitPractice.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTutorial {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);list.add(20);list.add(9);list.add(5);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o2<o1){
                    return 1;
                }
                if (o2>o1){
                    return -1;
                }
                return 0;
            }
        });

        System.out.println(list);
    }
}
