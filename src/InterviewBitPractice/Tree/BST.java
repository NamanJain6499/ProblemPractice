package InterviewBitPractice.Tree;

public class BST {
    public TreeNode insert(TreeNode node, int data) {
        if (node == null) {
            return new TreeNode(data);
        }

        if (data <= node.val) {
            node.left = insert(node.left, data);
        } else if ((data > node.val)) {
            node.right = insert(node.right, data);
        }

        return node;
    }
}
