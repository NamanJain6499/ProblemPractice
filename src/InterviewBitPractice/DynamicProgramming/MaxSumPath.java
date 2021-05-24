package InterviewBitPractice.DynamicProgramming;

public class MaxSumPath {
    public static void main(String[] args) {
        MaxSumPath max=new MaxSumPath();
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(20);
        root.left.right=new TreeNode(1);
        root.right=new TreeNode(10);
        root.right.right=new TreeNode(-25);
        root.right.right.left=new TreeNode(3);
        root.right.right.right=new TreeNode(4);



    }
}
