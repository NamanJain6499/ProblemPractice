package InterviewBitPractice.Tree;

public class PathSum {
    public static void main(String args[]){
        PathSum sum=new PathSum();
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(4);
        root.right=new TreeNode(8);
        root.left.left=new TreeNode(11);
        root.left.left.left=new TreeNode(7);
        root.left.left.right=new TreeNode(2);
        root.right.left=new TreeNode(13);
        root.right.right=new TreeNode(4);
        root.right.right.right=new TreeNode(1);
        int B=22;
        int answer=sum.solve(root,B);
        System.out.println(answer);
    }


    int ans=0;
    private int solve(TreeNode root, int B) {
        int val=0;
        if (root==null){
            return 0;
        }
        dfs(root,val,B);
        return ans;
    }

    private void dfs(TreeNode root, int val, int B) {
        if (root==null){
            return;
        }
        val=val+root.val;
        if (root.left==null&&root.right==null){
            if (val==B){
                ans=1;
            }
        }
        dfs(root.left,val,B);
        dfs(root.right,val,B);
    }
}
