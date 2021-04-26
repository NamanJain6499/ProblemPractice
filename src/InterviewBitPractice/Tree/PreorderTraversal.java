package InterviewBitPractice.Tree;

import java.util.ArrayList;

public class PreorderTraversal {
    public static void main(String args[]){
        PreorderTraversal order=new PreorderTraversal();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        ArrayList<Integer> answer=order.preorderTraversal(root);
        System.out.println(answer);
    }
    private ArrayList<Integer> preorderTraversal(TreeNode root){
        ArrayList<Integer> res=new ArrayList<>();
        preorder(root ,res);
        return res;

    }
    //root left right
    //here root encounter in start so we add root  in start
        private void preorder(TreeNode root, ArrayList<Integer> res) {
            if (root==null){
                return;
            }
            res .add(root.val);
            preorder(root.left,res);
            preorder(root.right,res);
        }
}
