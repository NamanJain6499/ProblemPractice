package InterviewBitPractice.Tree;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

//complete solution
//https://www.youtube.com/watch?v=GYdC4hQSo8A
public class ValidBstfromPreorder {
    public static void main(String[] args) {
        ValidBstfromPreorder preorder = new ValidBstfromPreorder();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<Integer>();
        System.out.println("Enter elements of preorder traversal:");
        while (scanner.hasNextInt()) {
            A.add(scanner.nextInt());
        }
        System.out.println((int) solve(A));
    }

    //we take first input of arraylist and find first number in A greater than input and check that all element on the rightof that should be greater than input
    private static int solve(ArrayList<Integer> A) {
        Stack<Integer> stack = new Stack<>();
        int root = Integer.MIN_VALUE;
        for (int i = 0; i < A.size(); i++) {
            while (!stack.isEmpty() && A.get(i) > stack.peek()) {
                root = stack.peek();
                stack.pop();
            }
            if (A.get(i) < root) {
                return 0;
            }
            stack.push(A.get(i));
        }
        return 1;
    }
}
