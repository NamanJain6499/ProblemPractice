package InterviewBitPractice.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
//solution
//https://www.youtube.com/watch?v=SnU0xiQ_jJ0
public class LeadersInArray {
    public static void main(String args[]){
        LeadersInArray leader=new LeadersInArray();
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> A=new ArrayList<>();
        while (scanner.hasNextInt()){
            A.add(scanner.nextInt());
        }
        ArrayList<Integer> answer=leader.solve(A);
        System.out.println(answer);

    }
    public ArrayList<Integer> solve(ArrayList<Integer> A){
        int n=A.size();
        int max_element=0;
        ArrayList<Integer> res=new ArrayList<>();
        for (int i=n-1;i>=0;i--){
            if (A.get(i)>max_element){
                max_element=A.get(i);
                res.add(A.get(i));
            }
        }
        return res;
    }
}
