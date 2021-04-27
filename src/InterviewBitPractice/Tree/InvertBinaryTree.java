package InterviewBitPractice.Tree;
//solution
//https://www.youtube.com/watch?v=fKgZiCXb6zs
public class InvertBinaryTree {
    public static void main(String args[]){
        InvertBinaryTree invert=new InvertBinaryTree();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(4);
        root.right=new TreeNode(2);
        root.left.left=new TreeNode(8);
        root.left.right=new TreeNode(5);
        root.left.right.left=new TreeNode(9);
        root.left.right.right=new TreeNode(7);
        root.right.right=new TreeNode(3);
        root.right.right.left=new TreeNode(6);
        TreeNode answer=invert.invertTree(root);
        System.out.println(root.val);
}

    private TreeNode invertTree(TreeNode A) {
        if(A==null){
            return A;
        }
        TreeNode left=invertTree(A.left);
        TreeNode right=invertTree(A.right);

        //swap
        A.left=right;
        A.right=left;
        return A;
    }
    }
