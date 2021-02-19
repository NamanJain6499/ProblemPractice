package InterviewBitPractice.Strings;

public class RemoveConsecutiveCharacter {
    public static void main(String args[]){
        String A="aabbccd";
        int B=2;
        RemoveConsecutiveCharacter removeConsecutiveCharacter=new RemoveConsecutiveCharacter();
        String answer=removeConsecutiveCharacter.solve(A,B);
        System.out.println(answer);

    }

    private String solve(String A, int B) {
        int n=A.length();
        String res="";
        for (int i=0;i<n;){
            int j=i;
            while (j<n && A.charAt(j)==A.charAt(i)){
                j++;
            }
            if (j-i==B){
                i=j;
            } else {
                res += A.charAt(i);
                i++;
            }
        }
        return res;

    }
}
