package InterviewBitPractice.StackAndQueue;

import java.util.Stack;
//solution
//from the solution given in editorial
public class SimplifyDirectoryPath {
    public static void main(String args[]){
        SimplifyDirectoryPath path=new SimplifyDirectoryPath();
        String A="/a/./b/../../c/";
        String answer=path.simplifyPath(A);
        System.out.println(answer);
    }

    private String simplifyPath(String A) {
        String str[] = A.split("/");
        Stack<String> s = new Stack<String>();
        for(int i=0; i<str.length; i++) {
            if(!str[i].equals("..") && !str[i].equals(".") && !str[i].equals("")) {
                s.push(str[i]);
            }
            else if(str[i].equals("..")) {
                if(s.size() > 0) {
                    s.pop();
                }
            }
        }
        Stack<String> s1 = new Stack<String>();
        while(s.size() > 0) {
            s1.push(s.pop());
        }
        StringBuffer sb = new StringBuffer();
        if(s1.size() == 0) {
            sb.append("/");
        }
        while(s1.size() > 0) {
            sb.append("/");
            sb.append(s1.pop());
        }
        return sb.toString();
    }
}
