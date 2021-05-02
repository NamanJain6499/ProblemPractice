package InterviewBitPractice.Tree;

//solution
//https://afteracademy.com/blog/sorted-array-to-balanced-bst
//the given array is sorted so can be treated as inorder traversal of tree and node tp the left pf middle are left subtree and
// node to the right are element of right sub tree
public class SortedArrayToBalancedBst {
    public static void main(String args[]){
        SortedArrayToBalancedBst sorted=new SortedArrayToBalancedBst();
        final int []A={1,2,3,4,5,6};
        TreeNode answer=sorted.sortedArrayToBST(A);
        System.out.println(answer.val);
    }

    private TreeNode sortedArrayToBST(final int[] A) {
        int n=A.length;
        TreeNode root=sortedArrayToBST_healper(A,0,n-1);
        return root;
    }

    private TreeNode sortedArrayToBST_healper(int[] A, int start, int end) {
        if(start>end){
            return null;
        }
        int mid=start+(end-start)/2;
        TreeNode root=new TreeNode(A[mid]);
        root.left=sortedArrayToBST_healper(A,start,mid-1);
        root.right=sortedArrayToBST_healper(A,mid+1,end);
        return root;
    }


}
