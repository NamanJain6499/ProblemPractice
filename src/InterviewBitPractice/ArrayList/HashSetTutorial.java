package InterviewBitPractice.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetTutorial {
    public static void  main(String  args[]){
        ArrayList<Integer> test=new ArrayList<>();
        test.add(1);
        test.add(1);
        test.add(4);
        test.add(4);
        test.add(3);
        HashSet<Integer> set=new HashSet<>(test);
        System.out.println(set);



    }
}
