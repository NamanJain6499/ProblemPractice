package InterviewBitPractice.Backtracking;

import java.util.ArrayList;

public class GenerateallParenthesesII {
    public static void main(String agrs[]){
        GenerateallParenthesesII parenthesesII=new GenerateallParenthesesII();
        int n=3;
        ArrayList<String> answer=parenthesesII.generateParenthesis(n);
        System.out.println(answer);
    }

    private ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> result=new ArrayList<String>();
        if (n==0){
            return result;
        }
        StringBuilder sb = null;
        for (int i=0;i<n;i++){
            sb.append("(");
        }
        for (int i=0;i<n;i++){
            sb.append(")");
        }
        backtracking(sb,0,new ArrayList<StringBuilder>(),result);
        return result;
    }

    private void backtracking(StringBuilder sb,int start, ArrayList<StringBuilder> list, ArrayList<String> result) {
        if (sb.length()==0){
            result.add((sb.toString()));
            return;
        }
        for (int i=start;i<sb.length();i++){
            list.add(sb);
            backtracking(sb,i+1,list,result);
            sb.deleteCharAt(list.size()-1);
        }

    }
}
