package InterviewBitPractice.Tree;

public class BalancedBinaryTree {
    public static void main(String args[]){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.right=new TreeNode(5);
        root.right.right.right=new TreeNode(7);
        BalancedBinaryTree bbt=new BalancedBinaryTree();
        int answer=bbt.isBalance(root);
        System.out.println(answer);
    }

    int f=1;
    private int isBalance(TreeNode root) {
        solve(root);
        return f;
    }

    private int solve(TreeNode root) {
        if (root==null){
            return 0;
        }
        int left=solve(root.left);
        int right=solve(root.right);
        if (Math.abs(left-right)>1){
            f=0;
        }
        return Math.max(left,right)+1;
    }
}
