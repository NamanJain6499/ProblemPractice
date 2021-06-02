package InterviewBitPractice.DynamicProgramming;

public class MaxSumPath {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(9);
        root.left = new TreeNode(-100);
        root.left.right = new TreeNode(-300);
        root.right = new TreeNode(-200);
        root.right.left = new TreeNode(-400);
        int i = maxPathSum(root);
        System.out.println(i);

    }

    public static int maxPathSum(TreeNode root) {
        // Res res = new Res();
        // res.val = Integer.MIN_VALUE;
        int res = Integer.MIN_VALUE;
        int solve = solve(root, res);
        return solve;

    }

    public static int solve(TreeNode root, int res) {
        if (root == null) {
            return 0;
        }
        int l = solve(root.left, res);
        int r = solve(root.right, res);

        int temp = Math.max(Math.max(l, r) + root.val, root.val);
        int ans = Math.max(temp, l + r + root.val);
        res = Math.max(res, ans);
        return res;
    }
}
