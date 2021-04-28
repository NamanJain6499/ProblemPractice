package InterviewBitPractice.Tree;

//solution
//https://www.youtube.com/watch?v=Gi0202QawRQ
public class SumRootToLeafNumbers {
    public static void main(String args[]) {
        SumRootToLeafNumbers sum = new SumRootToLeafNumbers();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.left.right = new TreeNode(5);
        int answer = sum.solve(root);
        System.out.println(answer);
    }
    int ans=0;
    private int solve(TreeNode root) {
        int val = 0;

        if (root==null)
            return 0;
        dfs(root,0);
        return ans;
    }

    private void dfs(TreeNode root, int val) {
        if (root==null){
            return;
        }
        val=(val*10)%1003+ (root.val)%1003;
        if (root.left==null&&root.right==null){
            ans+=val;
            return;
        }

        dfs(root.left,val);
        dfs(root.right,val);

    }


}
