package InterviewBitPractice.ArrayList;

public class TotalMovesForBishop {
    public static void main(String args[]){
        int A=4,B=4;
        TotalMovesForBishop moves=new TotalMovesForBishop();
        int count = moves.solve(A,B);
        System.out.println(count);
    }

    private int solve(int A, int B) {
        int topLeft=Math.min(A,B)-1;
        int topRight=Math.min(A,9-B)-1;
        int bottomLeft=8-Math.max(A,9-B);
        int bottomRight=8-Math.max(A,B);
        return(topLeft+topRight+bottomLeft+bottomRight);
    }
}
