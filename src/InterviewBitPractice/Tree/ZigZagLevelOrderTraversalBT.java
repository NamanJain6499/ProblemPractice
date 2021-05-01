package InterviewBitPractice.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
//solution
//https://www.youtube.com/watch?v=YBw5JRZK9_g
//for further learning check this https://www.youtube.com/watch?v=smjr2ow6oKc
public class ZigZagLevelOrderTraversalBT {
    public static void main(String args[]) {
        ZigZagLevelOrderTraversalBT zigZagLevelOrderTraversalBT = new ZigZagLevelOrderTraversalBT();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(9);
        root.left.right.right = new TreeNode(7);
        root.right.right = new TreeNode(3);
        root.right.right.left = new TreeNode(6);
        ArrayList<ArrayList<Integer>> answer=zigZagLevelOrderTraversalBT.solve(root);
        System.out.println(answer);
    }

    private ArrayList<ArrayList<Integer>> solve(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        zigzag(root, res);
        return res;
    }

    private void zigzag(TreeNode root, ArrayList<ArrayList<Integer>> res) {
        if (root==null)
            return;
        Queue<TreeNode> q=new LinkedList<>();
        boolean reverseLevel=false;
        q.add(root);
        while (!q.isEmpty()){
            int qsize=q.size();
            ArrayList<Integer> list=new ArrayList<>();
            for (int i=0;i<qsize;i++){
                TreeNode node=q.poll();
                list.add(node.val);
                if (node.left!=null) q.add(node.left);
                if (node.right!=null) q.add(node.right);
            }
            if (reverseLevel){
                Collections.reverse(list);
            }
            res.add(new ArrayList<>(list));
            reverseLevel=!reverseLevel;

        }
    }

}