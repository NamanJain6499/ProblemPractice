package InterviewBitPractice.Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class CycleinDirectedGraph {
    public static void main(String[] args) {
//        A : 3
//        B :
//[
//  [1, 3]
//  [2, 3]
//  [3, 2]
//]
        int A=5;
        ArrayList<ArrayList<Integer>> B=new ArrayList<>();
        for(int i=0;i<=A;i++){
            B.add(new ArrayList<>());
        }
        B.get(0).add(1);
        B.get(0).add(2);
        B.get(1).add(3);
        B.get(1).add(2);
        B.get(2).add(5);
        B.get(2).add(3);
        B.get(3).add(5);
        B.get(3).add(1);
        B.get(4).add(4);
        B.get(4).add(5);
        B.get(5).add(3);
        B.get(5).add(4);

        CycleinDirectedGraph cycleinDirectedGraph=new CycleinDirectedGraph();
        int answer=cycleinDirectedGraph.solve(A,B);
        System.out.println(answer);
    }

    public int solve(int vtces, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Edge>[] graph=new ArrayList[vtces];
        int edge=B.size();
        for(int i=0;i<vtces;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<edge;i++){
            int v1=B.get(i).get(0);
            int v2=B.get(i).get(1);
            graph[v1-1].add(new Edge(v1-1,v2-1));
        }
        boolean [] visited=new boolean[vtces];
        for(int v=0;v<vtces;v++){
            if(visited[v]==false){
                boolean cycle=isCycle(graph,v,visited);
                if(cycle){
                    return 1;
                }
            }
        }
        return 0;

    }

    public static boolean isCycle(ArrayList<Edge> [] graph,int src,boolean[] visited){

        visited[src]=true;
        for(Edge e:graph[src]){
            if(visited[e.nbr]==false){
                isCycle(graph,e.nbr,visited);
            }else{
                return true;
            }
        }
        visited[src]=false;

        return false;
    }
}


class Pair{
    int v;
    String psf;
    Pair(int v,String psf){
        this.v=v;
        this.psf=psf;
    }
}