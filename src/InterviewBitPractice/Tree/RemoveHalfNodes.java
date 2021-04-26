package InterviewBitPractice.Tree;
//solution
//https://www.youtube.com/watch?v=dKz9E5CYE4k&t=185s
public class RemoveHalfNodes {
    public static void main(String args[]){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.right=new TreeNode(5);
        root.right.right.right=new TreeNode(7);
        RemoveHalfNodes removeHalfNodes=new RemoveHalfNodes();
        TreeNode answer=removeHalfNodes.solve(root);
        System.out.println(answer.val);
    }

    private TreeNode solve(TreeNode root) {
        if (root==null)
            return null;
        root.left=solve(root.left);
        root.right=solve(root.right);
        if (root.left==null && root.right!=null ||root.left!=null && root.right==null){
            return root.left!=null?root.left:root.right;
        }
        return root;
    }
}
