package InterviewBitPractice.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrder {
    public static void main(String args[]){
        ReverseLevelOrder reverse=new ReverseLevelOrder();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(9);
        root.left.right.right = new TreeNode(7);
        root.right.right = new TreeNode(3);
        root.right.right.left = new TreeNode(6);
        ArrayList<Integer> answer=reverse.solve(root);
        System.out.println(answer);
    }
    public ArrayList<Integer> solve(TreeNode root){
        ArrayList<Integer> res=new ArrayList<>();
        reverseLevelOrder(root,res);
        return res;
    }
    Stack<Integer> st=new Stack<>();
    private void reverseLevelOrder(TreeNode root,ArrayList<Integer> res){
        if (root==null){
            return;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size=q.size();

            for (int i=0;i<size;i++){
                TreeNode node=q.poll();
                st.push(node.val);
                if (node.right!=null){
                    q.add(node.right);
                }
                if (node.left!=null){
                    q.add(node.left);
                }
            }
        }
        while (!st.isEmpty()){
            res.add(st.pop());
        }
    }
}
