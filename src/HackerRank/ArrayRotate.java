package HackerRank;

public class ArrayRotate {
    public static void main(String[] args) {
//        Input:
//        N = 5, D = 2
//        arr[] = {1,2,3,4,5}
        ArrayRotate rotate = new ArrayRotate();
        int N = 5;
        int D = 2;
        int[] arr = {1, 2, 3, 4, 5};
        rotate.solve(arr, D, N);
        System.out.println(arr);

    }

    private void solve(int[] arr, int d, int n) {
        for (int i = 0; i < d; i++) {
            int temp = arr[0];
            int j = 0;
            while (j < n) {
                if (j == n - 1) {
                    arr[j] = temp;
                    j++;
                }else{
                    arr[j] = arr[j + 1];
                    j++;
                }
            }
        }

    }
}
