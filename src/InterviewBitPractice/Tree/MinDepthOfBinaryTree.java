package InterviewBitPractice.Tree;

public class MinDepthOfBinaryTree {
    public static void main(String args[]){
        MinDepthOfBinaryTree min=new MinDepthOfBinaryTree();
        TreeNode root=new TreeNode(25);
        root.left=new TreeNode(9);
        root.right=new TreeNode(11);
        root.right.left=new TreeNode(5);
        root.right.left.left=new TreeNode(1);
        root.left.left=new TreeNode(10);
        root.left.left.left=new TreeNode(12);
        root.left.left.left.left=new TreeNode(6);
        int answer=min.minDepth(root);
        System.out.println(answer);
    }
    //solution
    //https://www.youtube.com/watch?v=JrrPcXix8zo
    public int minDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=minDepth(root.left);
        int right=minDepth(root.right);
        if (left==0||right==0){//if tree is skeewed
            return Math.max(left,right)+1;
        }
        return Math.min(left,right)+1;
    }
}
