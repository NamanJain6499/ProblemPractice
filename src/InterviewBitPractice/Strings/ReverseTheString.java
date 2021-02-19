package InterviewBitPractice.Strings;
//solution from
//https://www.youtube.com/watch?v=vhnRAaJybpA
public class ReverseTheString {
    public static void main(String args[]) {
        ReverseTheString string = new ReverseTheString();
        String A = "j";
        String answer=string.solve(A);
        System.out.println(answer);
    }

    private String solve(String a) {
        String result ="";
        String word;
        int i=0;
        int j=Integer.MAX_VALUE;
        int n=a.length();
        while (i<n){
            while (i<n && a.charAt(i)==' '){
                i++;
            }
            j=i+1;
            while (j<n && a.charAt(j)!=' '){
                j++;
            }
            word=a.substring(i,j);
            if (result.length()!=0){
                result=word+" "+result;
            }else
                result=word;
            i=j+1;

        }

        return result;
    }
}
