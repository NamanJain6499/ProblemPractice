package InterviewBitPractice.Tree;

import java.util.ArrayList;

public class PostorderTraversal {
    public static void main(String args[]) {
        PostorderTraversal traversal = new PostorderTraversal();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        ArrayList<Integer> answer = traversal.postorderTraversal(root);
        System.out.println(answer);
    }

    private ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;
    }

    private void postorder(TreeNode root, ArrayList<Integer> res) {
        if (root == null) {
            return;
        }
        //left right root
        //we add root at the point it encounter here root encounter in last so add that in last
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }
}
