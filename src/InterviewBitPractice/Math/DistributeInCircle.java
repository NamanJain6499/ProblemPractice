package InterviewBitPractice.Math;

public class DistributeInCircle {
    public static void main(String[] args) {
        DistributeInCircle circle = new DistributeInCircle();
        int Ath_item = 16673;
        int circle_Size_B = 7444;
        int starting_c = 30872;
        int answer =circle.solve(Ath_item,circle_Size_B,starting_c);
        System.out.println(answer);
    }

    private int solve(int A, int B, int C) {
        if((C+A-1)%B==0){
            return B;
        }else {
            return (C+A-1)%B;
        }
    }
}
