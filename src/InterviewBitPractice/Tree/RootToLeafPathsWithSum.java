package InterviewBitPractice.Tree;

import java.util.ArrayList;
//solution
//https://www.youtube.com/watch?v=HyNczj2pEEY
public class RootToLeafPathsWithSum {
    public static void main(String args[]){
        RootToLeafPathsWithSum pathsWithSum=new RootToLeafPathsWithSum();
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(4);
        root.right=new TreeNode(8);
        root.left.left=new TreeNode(11);
        root.left.left.left=new TreeNode(7);
        root.left.left.right=new TreeNode(2);
        root.right.left=new TreeNode(13);
        root.right.right=new TreeNode(4);
        root.right.right.left=new TreeNode(5);
        root.right.right.right=new TreeNode(1);
        int B=22;
        ArrayList<ArrayList<Integer>> answer=pathsWithSum.pathSum(root,B);
        System.out.println(answer);
    }
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root,int B){
        ArrayList<Integer> temp=new ArrayList<>();
        int val=0;
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if (root==null){
            return res;
        }
        path(root,B,res,val,temp);
        return res;
    }
    private void path(TreeNode root, int B, ArrayList<ArrayList<Integer>> res, int val, ArrayList<Integer> temp){
        if (root==null){
            return;
        }
        val=val+root.val;
        temp.add(root.val);
        if (root.left==null&&root.right==null){
            if (val==B){
                res.add(new ArrayList<>(temp));
            }

        }
        path(root.left,B,res,val, temp);
        path(root.right,B,res,val, temp);
        //removing the last element from temperary list as we will backtrack from here so we don't need that last element
        temp.remove(temp.size()-1);


    }
}
