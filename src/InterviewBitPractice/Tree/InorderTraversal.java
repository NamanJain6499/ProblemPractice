package InterviewBitPractice.Tree;

import java.util.ArrayList;

public class InorderTraversal {
    public static void main(String args[]){
        InorderTraversal traversal=new InorderTraversal();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        ArrayList<Integer> answer=traversal.inorderTraversal(root);
        System.out.println(answer);
    }
    public ArrayList<Integer> inorderTraversal(TreeNode root){
        ArrayList<Integer> res=new ArrayList<>();
        inorder(root,res);
        return  res;
    }
    //left root right
    //we add root at the point it encounter here root is encounter in mddle so add in middle
    private void inorder(TreeNode root, ArrayList<Integer> res) {
        if (root==null){
            return;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
}
