package InterviewBitPractice.Tree;

import java.util.ArrayList;

public class PathToGivenNode {
    public static void main(String args[]){
        PathToGivenNode path=new PathToGivenNode();
        TreeNode root = null;
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.left.right = new TreeNode(5);
        int B=4;
        ArrayList<Integer> answer=path.solve(root,B);
        System.out.println(answer);
    }

    private ArrayList<Integer> solve(TreeNode A, int B) {
        ArrayList<Integer> res=new ArrayList<>();
        preorder(A,B,res);
        return res;
    }

    private void preorder(TreeNode A, int B, ArrayList<Integer> res) {
        if(A.val==B){
            res.add(B);
            return;
        }

        if(A.left==null && A.right==null){
            return;
        }
        res.add(A.val);
        if(A.left!=null){
            preorder(A.left,B,res);
        }
        if(A.right!=null){
            preorder(A.right,B,res);
        }
        if(res.get(res.size()-1)!=B){
           res.remove(res.size()-1);
        }
    }
}
