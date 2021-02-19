package InterviewBitPractice.ArrayList;

public class IsRectangle {
    public static void main(String args[]){
        int A=1,B=1,C=2,D=5;
        IsRectangle isRectangle=new IsRectangle();
        int rectangle=isRectangle.solve(A,B,C,D);
        System.out.println(rectangle);

    }

    private int solve(int a, int b, int c, int d) {
        if(a==b&&c==d){
            return 1;
        }
        else if (a==c&&b==d){
            return 1;
        }
        else if (a==d&&b==c){
            return 1;
        }
        else
            return 0;
    }
}
