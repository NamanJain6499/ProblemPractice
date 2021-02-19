package InterviewBitPractice.Strings;

import java.util.Locale;

//solution from
//https://www.programcreek.com/2013/01/leetcode-valid-palindrome-java/
public class PalindromeString {
    public static void main(String args[]){
        String str="1a2";
        PalindromeString palindrome=new PalindromeString();
        int answer=palindrome.isPalindrome(str);
        System.out.println(answer);
    }

    private int isPalindrome(String str) {
        int len=str.length();
        int start=0;
        int end=len-1;
        str=str.toLowerCase(Locale.ROOT);
        while (start<=end){
            char atLeft=str.charAt(start);
            char atRight=str.charAt(end);
            //if at left element is not from a to z or element is not from 0 to 9 then it is space of comma or full stop or something else
            if (!((atLeft>='a' && atLeft<='z')||(atLeft>='0' && atLeft<='9'))) start++;
            else if (!((atRight>='a' && atRight<='z')||(atRight<='0'&&atRight>='9'))) end--;
            else if (atLeft==atRight){
                start++;
                end--;
            }else
                return 0;

        }
        return 1;
    }
}
