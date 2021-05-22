package InterviewBitPractice.GreedyProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
//solution
//https://www.geeksforgeeks.org/maximal-disjoint-intervals/
public class DisjointIntervals {
    public static void main(String[] args) {
        DisjointIntervals intervals=new DisjointIntervals();
        ArrayList<ArrayList<Integer>> A=new ArrayList<>();
        int N=3;
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<N;i++){
            A.add(new ArrayList<>());
            A.get(i).add(scanner.nextInt());
            A.get(i).add(scanner.nextInt());
        }
        int answer=intervals.solve(A);
        System.out.println(answer);
    }

    private int solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Pair> arr=new ArrayList<Pair>();
        for (int i=0;i<A.size();i++){
            arr.add(new Pair(A.get(i).get(0),A.get(i).get(1)));
        }
        Collections.sort(arr, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.second>o2.second){
                    return 1;
                }
                else if(o1.second==o2.second){
                    return 0;
                }
                return -1;
            }
        });
        int count=1;
        int r1=arr.get(0).second;
        for (int i=1;i< arr.size();i++){
            int l1=arr.get(i).first;
            int r2=arr.get(i).second;
            if(l1>r1){
                count++;
                r1=r2;
            }
        }
        return count;

    }

    private class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
