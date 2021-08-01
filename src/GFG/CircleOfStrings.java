package GFG;

public class CircleOfStrings {
    public static void main(String[] args) {
        CircleOfStrings circleOfStrings=new CircleOfStrings();
        String[] A=new String[]{"ijk", "kji", "abc", "cba"};
        int N=4;
        int ans =circleOfStrings.isCircle(N,A);
        System.out.println(ans);
    }

    private int isCircle(int N, String[] A) {
        boolean[] visited=new boolean[N];
        Pair[] graph=new Pair[N];
        for(int i=0;i<N;i++){
            int str_size=A[i].length();
            graph[i]=new Pair(A[i].charAt(0) , A[i].charAt(str_size-1));
        }
        visited[0]=true;
        if(A.length==1){
            return 1;
        }
        for(int i=1;i<=graph.length-1;i++){
            if(graph[0].second==graph[i].first ){
                visited[i]=true;
                if(circle(graph , visited , i , N,1)){
                    return 1;
                }

            }
        }
        return 0;
    }
    public static boolean circle(Pair[] graph , boolean[] visited , int i , int N,int count){
        if(count==N-1){
            return true;
        }

        visited[i]=true;
        for(int j=0;j<N;j++){
            if(visited[j]==false && graph[i].second==graph[j].first ){
                if(circle(graph,visited,j,N,count+1)){
                    return true;
                }
            }
        }

        return false;
    }
}
class Pair{
    char first;
    char second;
    Pair(char first,char second){
        this.first=first;
        this.second=second;
    }
}
