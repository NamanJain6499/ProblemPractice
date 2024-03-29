package InterviewBitPractice.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {
    public static void main(String[] args) {
        int A=3;
//                A : 3
//        B : [ 1, 2, 3 ]
//        C : [ 2, 3, 1 ]
        ArrayList<Integer>  B=new ArrayList<>();
        ArrayList<Integer>  C=new ArrayList<>();
        B.add(1);
        B.add(2);
        B.add(3);
        C.add(2);
        C.add(3);
        C.add(1);
        TopologicalSort sort=new TopologicalSort();
        int answer=sort.solve(A,B,C);
        System.out.println(answer);
    }

    private int solve(int vtces, ArrayList<Integer> B, ArrayList<Integer> C) {ArrayList<Edge>[] graph=new ArrayList[vtces];
        for(int i=0;i<vtces;i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0;i<B.size()-1;i++){
            int v1=B.get(i);
            int v2=B.get(i+1);
            graph[v1-1].add(new Edge(v1-1,v2-1));
        }
        for(int i=0;i<C.size()-1;i++){
            int v1=C.get(i);
            int v2=C.get(i+1);
            graph[v1-1].add(new Edge(v1-1,v2-1));
        }
        int[] indegree=new int[vtces];
        for(int v=0;v<vtces;v++){
            for(Edge e:graph[v]){
                indegree[e.nbr]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int index=0;
        while(q.size()>0){
            int rem=q.remove();
            index++;
            for(Edge e:graph[rem]){
                indegree[e.nbr]--;
                if(indegree[e.nbr]==0){
                    q.add(e.nbr);
                }
            }
        }
        if(index==vtces){
            return 1;
        }
        return 0;
    }
}

