package InterviewBitPractice.Strings;

public class LengthOfLastWord {
    public  static void main(String agrs[]){
        String str="  ";
        LengthOfLastWord length=new LengthOfLastWord();
        int answer=length.solve(str);
        System.out.println(str.length());
        System.out.println(answer);
    }

    private int solve(String s) {
        if(s==null || s.length() == 0)
            return 0;

        int result = 0;
        int len = s.length();

        boolean flag = false;
        for(int i=len-1; i>=0; i--){
            char c = s.charAt(i);
            if((c>='a' && c<='z') || (c>='A' && c<='Z')){
                flag = true;
                result++;
            }else{
                if(flag)
                    return result;
            }
        }

        return result;

    }
}
