package InterviewBitPractice.Tree;

import java.util.ArrayList;
import java.util.HashMap;

public class DiagonalTraversal {
    public static void main(String args[]){
        DiagonalTraversal diagonal=new DiagonalTraversal();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(4);
        root.right=new TreeNode(2);
        root.left.left=new TreeNode(8);
        root.left.right=new TreeNode(5);
        root.left.right.left=new TreeNode(9);
        root.left.right.right=new TreeNode(7);
        root.right.right=new TreeNode(3);
        root.right.right.left=new TreeNode(6);
        ArrayList<Integer> answer=diagonal.solve(root);
        System.out.println(answer);
    }
    public ArrayList<Integer> solve(TreeNode root){
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        ArrayList<Integer> res=new ArrayList<>();
        int distance=0;
        diagonalTraversal(root,map,distance,res);
        return res;
    }

    private void diagonalTraversal(TreeNode root, HashMap<Integer, ArrayList<Integer>> map, int distance, ArrayList<Integer> res) {

    }
}
