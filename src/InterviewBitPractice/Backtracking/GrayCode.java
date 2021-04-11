package InterviewBitPractice.Backtracking;

import java.util.ArrayList;

public class GrayCode {
    public static void main(String args[]) {
        GrayCode code = new GrayCode();
        int A = 3;
        ArrayList<Integer> answer = code.grayCode(A);
        System.out.println(answer);
    }

    private ArrayList<Integer> grayCode(int a) {
        ArrayList<String> ans = solution(a);
        ArrayList<Integer> res = new ArrayList<>();
        for (String str : ans) {
            int sum = 0;
            int j = 0;
            for (int i = str.length() - 1; i >= 0; i--) {
                sum += (str.charAt(i) - '0') * Math.pow(2, j);
                j++;
            }
            res.add(sum);
        }
        return res;
    }

    private ArrayList<String> solution(int n) {
        if (n == 1) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("0");
            bres.add("1");
            return bres;
        }
        ArrayList<String> rres = solution(n - 1);
        ArrayList<String> mres = new ArrayList<>();
        for (int i = 0; i < rres.size(); i++) {
            String rstr = rres.get(i);
            mres.add("0" + rstr);
        }
        for (int i = rres.size() - 1; i >= 0; i--) {
            String rstr = rres.get(i);
            mres.add("1" + rstr);
        }
        return mres;
    }
}
