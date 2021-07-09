package InterviewBitPractice.Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class TwoTeams
{
    public static void main(String[] args) {
        int A=4;
        TwoTeams two=new TwoTeams();
        ArrayList<ArrayList<Integer>> B=new ArrayList<>();
        for(int i=0;i<4;i++){
            B.add(new ArrayList<>());
        }
        B.get(0).add(1);
        B.get(0).add(4);
        B.get(1).add(3);
        B.get(1).add(1);
        B.get(2).add(4);
        B.get(2).add(3);
        B.get(3).add(2);
        B.get(3).add(1);

        int answer=two.solve(A,B);
        System.out.println(answer);


    }

    private int solve(int vtces, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Edge>[] graph=new ArrayList[vtces];
        for(int i=0;i<vtces;i++){
            graph[i]=new ArrayList<>();
        }
        int edge=B.size();
        for(int i=0;i<edge;i++){
            int v1=B.get(i).get(0);
            int v2=B.get(i).get(1);
            graph[v1-1].add(new Edge(v1-1,v2-1));
            graph[v2-1].add(new Edge(v2-1,v1-1));
        }
        int [] visited=new int[vtces];
        Arrays.fill(visited,-1);
        for(int v=0;v<vtces;v++){
            if(visited[v]==-1){
                    boolean isBipartite=checkBipartite(graph,v,visited);
                    if(isBipartite==false){
                        return 0;
                    }
            }
        }
        return 1;
    }

    public boolean checkBipartite(ArrayList<Edge>[] graph, int src, int[] visited) {
        ArrayDeque<Pair1> q=new ArrayDeque<>();
        q.add(new Pair1(src,src+"",0));
        while(q.size()>0){
            Pair1 rem=q.removeFirst();
            if(visited[rem.v]!=-1){
                if(rem.level!=visited[rem.v]){
                    return false;
                }
            }else{
                visited[rem.v]=rem.level;
            }
            for(Edge e:graph[rem.v]){
                if(visited[e.nbr]==-1){
                    q.add(new Pair1(e.nbr,rem.psf+e.nbr,rem.level+1));
                }
            }
        }
        return true;
    }
}

class Pair1{
    int v;
    String psf;
    int level;
    Pair1(int v,String psf,int level){
        this.v=v;
        this.psf=psf;
        this.level=level;
    }
}
