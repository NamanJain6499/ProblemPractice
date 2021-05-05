package InterviewBitPractice.Tree;
//solution from interviewbit editorial
public class FlattenBinaryTreeToLinklist {
    public static void main(String args[]){
        FlattenBinaryTreeToLinklist flatten=new FlattenBinaryTreeToLinklist();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.left.right = new TreeNode(5);
        TreeNode answer=flatten.flatten(root);
        System.out.println(answer.val);
    }

    TreeNode head=new TreeNode(0);
    TreeNode cur=head;
    public TreeNode flatten(TreeNode a) {
        preorder(a);
        return head.right;
    }
    private void preorder(TreeNode a){
        if(a==null){
            return;
        }
        cur.right=new TreeNode(a.val);
        cur=cur.right;
        preorder(a.left);
        preorder(a.right);
    }


}
