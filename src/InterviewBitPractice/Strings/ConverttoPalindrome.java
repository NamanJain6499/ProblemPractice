package InterviewBitPractice.Strings;

public class ConverttoPalindrome {
    public static void main(String[] args) {
        ConverttoPalindrome convert=new ConverttoPalindrome();
        String A="abecbea";
        int answer= convert.solve(A);
        System.out.println(answer);
    }

    private int solve(String a) {
       int n=a.length();
       int i=0;
       int j=n-1;
       while (i<=j){
           if(a.charAt(i)==a.charAt(j)){
               i++;
               j--;
           }else {
               if(isPalindrome(a,i+1,j)){
                   return 1;
               }
               else if (isPalindrome(a,i,j-1)){
                   return  1;
               }
               return 0;
           }

       }
        return 1;
    }
    public boolean isPalindrome(String a,int start,int end){
        int i=start;
        int j=end;
        while (i<=j){
            if (a.charAt(i) != a.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
