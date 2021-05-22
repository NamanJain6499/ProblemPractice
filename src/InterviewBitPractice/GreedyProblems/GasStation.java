package InterviewBitPractice.GreedyProblems;

import java.util.ArrayList;
//solution
//https://www.youtube.com/watch?v=xWgbFI_rXJs&t=455s
public class GasStation {
    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        A.add(1);
        A.add(2);
        B.add(2);
        B.add(1);
        int answer = gasStation.solve(A, B);
        System.out.println(answer);
    }

    private int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int total = 0;
        int tank = 0;
        int index = 0;
        for (int i = 0; i < A.size(); i++) {
            int consume = A.get(i) - B.get(i);
            tank += consume;
            if (tank < 0) {
                index = i + 1;
                tank = 0;
            }
            total = total + consume;
        }
        return total < 0 ? -1 : index;
    }
}
