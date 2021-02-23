package InterviewBitPractice.Strings;

public class AddBinaryStrings {
    public static void main(String args[]){
        AddBinaryStrings strings=new AddBinaryStrings();
        String str1="11011";
        String str2="1101010";
        String answer=strings.addStrings(str1,str2);
        System.out.println(answer);
    }

    private String addStrings(String str1, String str2) {
        StringBuilder sb=new StringBuilder();
        int i=str1.length()-1;
        int j=str2.length()-1;

        int carry=0;
        while (i>=0 || j>=0){
            int sum=carry;
            if (i>=0)
                sum+=str1.charAt(i)-'0';
            if (j>=0)
                sum+=str2.charAt(j)-'0';
            sb.append(sum%2);
            carry=sum/2;
            i--;
            j--;

        }
        if (carry!=0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
