package InterviewBitPractice.Tree;

//refer this blog on how to create a tree
//https://www.baeldung.com/java-binary-tree


//we know the fact that INORDER is already in sorted form and we make count varible which will count Kth min value

public class KthSmallestElementInTree {

    public static void main(String[] args) {
        KthSmallestElementInTree smallestElementInTree = new KthSmallestElementInTree();
        BST a = new BST();
        TreeNode root = null;

        root = a.insert(root, 20);
        root = a.insert(root, 8);
        root = a.insert(root, 22);
        root = a.insert(root, 4);
        root = a.insert(root, 12);
        root = a.insert(root, 10);
        root = a.insert(root, 14);
        int answer = smallestElementInTree.kthSmallest(root, 3);
        System.out.println(answer);

    }

    int count = 0;
    int out = 0;

    public int kthSmallest(TreeNode root, int k) {
        recur(root, k);
        return out;
    }

    public void recur(TreeNode node, int k) {
        if (node.left != null) {
            recur(node.left, k);
        }
        count++;
        if (count == k) {
            out = node.val;
            return;
        }
        if (node.right != null) {
            recur(node.right, k);
        }
    }
}