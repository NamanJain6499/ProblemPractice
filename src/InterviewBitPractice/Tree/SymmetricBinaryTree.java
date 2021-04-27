package InterviewBitPractice.Tree;

public class SymmetricBinaryTree {
    public static void main(String args[]){
        SymmetricBinaryTree symmetric=new SymmetricBinaryTree();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);
        root.right.left=new TreeNode(4);
        root.right.right=new TreeNode(3);
        int answer=symmetric.solve(root);
        System.out.println(answer);

    }
    public int solve(TreeNode root){
        if (root==null)
            return 1;
        return isSymmetric(root.left,root.right);
    }

    private int isSymmetric(TreeNode left, TreeNode right) {
        if (left==null&&right==null){
            return 1;
        }
        else if (left==null&&right!=null){
            return 0;
        }
        else if (left!=null&&right==null){
            return 0;
        }
        if (left.val!=right.val){
            return 0;
        }
        if(isSymmetric(left.left,right.right)==1 && isSymmetric(left.right,right.left)==1){
            return 1;
        }
        return 0;
    }
}
