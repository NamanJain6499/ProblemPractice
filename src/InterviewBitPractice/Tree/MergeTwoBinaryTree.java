package InterviewBitPractice.Tree;

public class MergeTwoBinaryTree {
    public static void main(String args[]) {
        MergeTwoBinaryTree merge=new MergeTwoBinaryTree();
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        root1.right.right = new TreeNode(6);

        TreeNode root2 = new TreeNode(4);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(7);
        root2.left.left = new TreeNode(3);
        root2.right.left = new TreeNode(2);
        root2.right.right = new TreeNode(6);
        TreeNode answer=merge.solve(root1,root2);
        System.out.println(answer.right.left.val);


    }

    private TreeNode solve(TreeNode root1, TreeNode root2) {
        if (root1==null){
            return root2;
        }
        if (root2==null){
            return root1;
        }
        TreeNode root=new TreeNode(root1.val+root2.val);
        root.left=solve(root1.left,root2.left);
        root.right=solve(root1.right,root2.right);
        return root;




    }


}
