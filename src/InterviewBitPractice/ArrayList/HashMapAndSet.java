package InterviewBitPractice.ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class HashMapAndSet {

    public static void main(String[] args) {

        HashMap<Integer, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> A = new ArrayList<>();
        A.add("Aakash");
        A.add("Naman");
        ArrayList<String> B = new ArrayList<>();
        B.add("Golu");
        B.add("Naman");
        map.put(1, A);
        map.put(2, B);
        System.out.println(map);
        ArrayList<String> strings = map.get(2);
        strings.add("anita");
        map.put(2,strings);
        System.out.println(map);

        HashMap<String,Integer> tree1=new HashMap<>();
        tree1.put("ljklj",89);
        tree1.put("Aakash",0);
        tree1.put("zzzxc",7);
        tree1.put("dasgdh",8);
        System.out.println(tree1);
        System.out.println(tree1.containsKey("Aakash"));
        HashMap<String,Integer> tree2=new HashMap<>(tree1);
        System.out.println(tree2);

        TreeMap<String,Integer> tree=new TreeMap<>();

        tree.put("ljklj",89);
        tree.put("Aakash",0);
        tree.put("zzzxc",7);
        tree.put("dasgdh",8);
        System.out.println(tree);

    }
}
