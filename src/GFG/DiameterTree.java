package GFG;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}


public class DiameterTree {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(25);
        node.left=new TreeNode(12);
        node.right=new TreeNode(15);
        node.left.left=new TreeNode(18);
        node.right.right=new TreeNode(60);
        DiameterTree diameterTree = new DiameterTree();
        diameterTree.diameter(node);
    }

      int diameter(TreeNode root) {
        // Your code here
//        Res res = new Res();
//        res.val = Integer.MIN_VALUE;
          int res=Integer.MIN_VALUE;
        solve(root,res);
        return res;
    }
    public  int solve(TreeNode root,int res){
        if(root==null){
            return 0;
        }

        int l=solve(root.left,res);
        int r=solve(root.right,res);

        int temp=Math.max(l,r)+1;
        int ans=Math.max(temp,l+r+1);
        res=Math.max(res,ans);

        return temp;
    }
}

class Res {
    public int val;
}
