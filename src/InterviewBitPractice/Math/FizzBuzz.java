package InterviewBitPractice.Math;

import java.util.ArrayList;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz buzz=new FizzBuzz();
        int A=5;
        ArrayList<String> answer=buzz.solve(A);
        System.out.println(answer);
    }
    public ArrayList<String> solve(int A){
        ArrayList<String> str=new ArrayList<>();
        for(int i=1;i<=A;i++){
            if (i%3==0 && i%5!=0){
                str.add("Fizz");
            }
            else if (i%3!=0 && i%5==0){
                str.add("Buzz");
            }
            else if (i%3==0 && i%5==0){
                str.add("FizzBuzz");
            }
            else {

                str.add(Integer.toString(i));
            }
        }
        return str;
    }
}
