package InterviewBitPractice.BinarySearch;

public class SquareRootOfInteger {
    public static void main(String args[]) {
        SquareRootOfInteger sqrt = new SquareRootOfInteger();
        int A = 2147483647;
        int answer = sqrt.solve(A);
        System.out.println(answer);
    }
//we need to find square root of A so lets say A is square of X.
// now if (mid)^2 > (X)^2 this means mid > X hence right =mid-1
// same goes with (mid)^2 < (X)^2 that means mid < X hence left=mid+1.
//this involve binary search.
// and here long is used as if maximum of integer is taken as right and addding any value to it for getting mid will make it out of range of "int"
// hence prefer using "long"
        private int solve(int A) {
            if (A == 0)
                return 0;
            long left = 1;
            long right = A;
            long result=0;

            while (left <= right) {
                long mid = left + (right - left) / 2;
                if (mid * mid > A) {
                    right = mid - 1;
                } else if (mid * mid < A) {
                    result=mid;
                    left = mid + 1;
                } else
                    return  (int) mid;
            }
            return (int) result;

    }
}
