package InterviewBitPractice.Tree;

import java.util.HashSet;
import java.util.Set;

public class TwoSumBinaryTree {
    public static void main(String args[]) {

        BST a = new BST();
        TreeNode root = null;

        root = a.insert(root, 7);
        root = a.insert(root, 4);
        root = a.insert(root, 1);
        root = a.insert(root, 20);
        root = a.insert(root, -1);
        root = a.insert(root, -1);
        root = a.insert(root, -1);
        root = a.insert(root, -1);

        int B = 21;
        TwoSumBinaryTree sum = new TwoSumBinaryTree();
        int answer = sum.t2Sum(root, B);
        System.out.println(answer);

    }

    //concept or intitution from here
    //https://www.youtube.com/watch?v=zSg6yfLduro&t=634s
    private int t2Sum(TreeNode root, int k) {
        Set<Integer> set = new HashSet();
        int res = find(root, k, set);
        return res;
    }

    public int find(TreeNode root, int k, Set<Integer> set) {
        if (root == null)
            return 0;
        if (set.contains(k - root.val))
            return 1;
        set.add(root.val);
        if (find(root.left, k, set) == 1) {
            return 1;
        }
        return find(root.right, k, set);
    }
}
