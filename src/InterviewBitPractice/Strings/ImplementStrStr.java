package InterviewBitPractice.Strings;

public class ImplementStrStr {
    public static void main(String args[]) {
        String haystack = "bbbbbbbbab";
        String needle = "baba";
        ImplementStrStr str = new ImplementStrStr();
        int answer = str.strstr(haystack, needle);
        System.out.println(answer);
    }

    private int strstr(String a, String b) {
        int ans=-1;
        int len=b.length();
        for(int i=0;i<a.length()-len+1;i++){

            String str=a.substring(i,i+len);
            if(str.equals(b)){
                ans=i;
                break;
            }
        }
        return ans;


    }
}
