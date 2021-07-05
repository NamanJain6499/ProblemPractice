package InterviewBitPractice.Graph;

public class RegionBinaryMatrix {

    public static void main(String[] args) {
        int [][]A=new int[4][5];
        A= new int[][]{{0, 0, 1, 1, 0},
                        {1,0,1,1,0},
                {0,1,0,0,0},
                {0,0,0,0,1}};
        RegionBinaryMatrix region=new RegionBinaryMatrix();
        int ans=region.solve(A);
        System.out.println(ans);
    }

    private int solve(int[][] A) {
        int r=A.length;
        int c=A[0].length;
        int area=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if( A[i][j]==1 ){
                    area=Math.max(area,dfs(A,i,j));
                }
            }
        }
        return area;
    }
    public static int dfs(int [][] A, int r, int c){
        if(r<0 || c<0  ||r>=A.length ||c>=A[0].length ||A[r][c]!=1){
            return 0;
        }
        A[r][c]=2;


        return 1+ dfs( A,r+1,c)+dfs( A,r,c+1)+dfs( A,r-1,c)+dfs( A,r,c-1)+dfs( A,r-1,c-1)+
                dfs(A,r+1,c+1)+dfs(A,r-1,c+1)+dfs( A,r+1,c-1);
    }
}
