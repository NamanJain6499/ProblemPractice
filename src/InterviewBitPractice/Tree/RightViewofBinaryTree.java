package InterviewBitPractice.Tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightViewofBinaryTree {
    public static void main(String args[]) {
        RightViewofBinaryTree right = new RightViewofBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(9);
        root.left.right.right = new TreeNode(7);
        root.right.right = new TreeNode(3);
        root.right.right.left = new TreeNode(6);
        ArrayList<Integer> answer = right.solve(root);
        System.out.println(answer);
    }

    private ArrayList<Integer> solve(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        rightView(root, res);
        return res;
    }

    //solution
    //https://www.youtube.com/watch?v=_QaB7SuWWIU
    private void rightView(TreeNode root, ArrayList<Integer> res) {
        if (root == null)
            return;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()) {
            int len= que.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = que.poll();
                if (i == len - 1) {
                    res.add(node.val);
                }
                if (node.left != null) {
                    que.add(node.left);
                }
                if (node.right != null) {
                    que.add(node.right);
                }
            }
        }
    }
}
