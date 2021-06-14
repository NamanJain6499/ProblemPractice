package HackerRank;

public class Substring {
    public static void main(String[] args) {
        String A = "ab";
        String B = "cab";
        int answer = solve(A, B);
        System.out.println(answer);
    }

    private static int solve(String A, String B) {
        int i = 0;
        String temp1 = "";
        while (i < A.length() && B.charAt(0) != A.charAt(i)) {
            temp1 = temp1 + A.charAt(i);
            i++;
        }
        int j = A.length() - 1;
        String temp2 = "";
        while (j >= 0 && B.charAt(B.length() - 1) != A.charAt(j)) {
            temp2 = A.charAt(j) + temp2;
            j--;
        }
        String C = temp1 + B + temp2;
        char ch = A.charAt(0);
        int count = 0;
        if (i == A.length() || j == 0) {
            return -1;
        } else {
            for (int k = 0; k < C.length(); k++) {
                if (C.charAt(k) == ch) {
                    count++;
                }
            }
        }


        return count;
    }
}
