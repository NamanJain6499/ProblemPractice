package InterviewBitPractice.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSum {
    public static void main(String args[]){
        MaximumLevelSum sum=new MaximumLevelSum();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(6);
        root.right.right.right = new TreeNode(7);
        int answer=sum.solve(root);
        System.out.println(answer);
    }

    private int solve(TreeNode root) {
        if (root==null){
            return 0;
        }
        int result=root.val;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int len= q.size();
            int summation=0;
            while (len-->0){
                TreeNode node=q.poll();
                summation=summation+node.val;

                if (node.left!=null){
                    q.add(node.left);
                }
                if (node.right!=null){
                    q.add(node.right);
                }
            }
            result=Math.max(summation,result);
        }
        return result;
    }


}
