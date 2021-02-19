package InterviewBitPractice.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

//youtube video for explanation
//https://www.youtube.com/watch?v=siKFOI8PNKM

public class SpiralOrderMatrix {
    public static void main(String args[]) {
        SpiralOrderMatrix spiral = new SpiralOrderMatrix();
        int A = 4;
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        matrix = spiral.solve(A);
        for (ArrayList<Integer> i : matrix) {
            System.out.println(i);
        }


//T    }
//1 2 3 4
//5 6 7 8
//9 10 11 12
//B13 14 15 16
// L        R        //T =>Top B=>bottom L=>left  R=>right

    }

    public ArrayList<ArrayList<Integer>> solve(int A) {
        int T = 0, B = A - 1, L = 0, R = A - 1;
        int dir = 0;
        int count = 1;
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < A; i++) {
            list.add(new ArrayList<Integer>(Arrays.asList(new Integer[A])));
        }
        while (T <= B && L <= R) {
            if (dir == 0) {
                for (int i = L; i <= R; i++) {
                    list.get(T).set(i, count);
                    count++;
                }
                T++;
                dir = 1;
            }
            if (dir == 1) {
                for (int i = T; i <= B; i++) {
                    list.get(i).set(R, count);
                    count++;
                }
                R--;
                dir = 2;
            }
            if (dir == 2) {
                for (int i = R; i >= L; i--) {
                    list.get(B).set(i, count);
                    count++;
                }
                B--;
                dir = 3;
            }
            if (dir == 3) {
                for (int i = B; i >= T; i--) {
                    list.get(i).set(L, count);
                    count++;
                }
                dir = 0;
                L++;
            }
        }
        return list;
    }
}


