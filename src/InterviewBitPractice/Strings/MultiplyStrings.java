package InterviewBitPractice.Strings;

public class MultiplyStrings {
    public static void main(String args[]) {
        String num1 = "9999999999";
        String num2 = "2";
        MultiplyStrings mul = new MultiplyStrings();
        String answer = mul.solve(num1, num2);
        System.out.println(answer);
    }

    private String solve(String a, String b) {
        int[] res = new int[a.length() + b.length()];
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                res[i + j + 1] += (a.charAt(i) - '0') * (b.charAt(j) - '0');
            }
        }
        int carry = 0;
        for (int i = res.length - 1; i >= 0; i--) {
            int val = res[i] + carry;
            res[i] = val % 10;
            carry = val / 10;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < res.length - 1 && res[i] == 0) {
            i++;
        }
        while (i < res.length) {
            sb.append((char) (res[i] + '0'));
            i++;
        }
        return sb.toString();

    }


   //public String multiply(String A, String B) {
   //    int num1=Integer.parseInt(A);
   //    int num2=Integer.parseInt(B);
   //    int sum=0;
   //    int i=0;
   //    while (i<B.length()){
   //        int temp=num2%10;
   //        sum+=num1*temp*Math.pow(10,i);
   //        num2/=10;
   //        i++;
   //    }
   //    return String.valueOf(sum);
   //}
}
