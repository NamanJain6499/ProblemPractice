package InterviewBitPractice.ArrayList;

public class ExcelColumnNumber {


    public  static void  main(String args[]){
        String A="BA";

        ExcelColumnNumber columnNumber=new ExcelColumnNumber();
        int number=columnNumber.titleToNumber(A);
        System.out.println(number);
    }

    private int titleToNumber(String A) {
        int len=A.length();
        int result=0;
        int j=0;
        for (int i=len-1;i>=0;i--){
            result += (int) ((A.charAt(i)-'A'+1)*Math.pow(26,j));
            j++;
        }

        return result;
    }
}
