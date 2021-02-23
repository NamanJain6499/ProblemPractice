package InterviewBitPractice.Strings;

import java.math.BigInteger;

public class PowerOf2 {
    public static void main(String args[]) {
        PowerOf2 power = new PowerOf2();
        String num = "147573952589676412928";
        int answer = power.solve(num);
        System.out.println(answer);
    }
//BigInteger class is used for mathematical operation which involves very big integer calculations
// that are outside the limit of all available primitive data types.
    private int solve(String A) {
        //bitCount() is a method of Integer class under java.lang package.
        // It returns the number of one-bits in the two's complement binary representation of the specified int value.
        if(A.equals("1"))
            return 0;
        BigInteger N = new BigInteger(A);
        if(N.bitCount()==1)
            return 1;
        else
            return 0;
    }
}
