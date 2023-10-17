class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BSTComparison {
    public static boolean areSameElements(TreeNode root1, TreeNode root2) {
        List<Integer> elements1 = new ArrayList<>();
        List<Integer> elements2 = new ArrayList<>();

        inOrderTraversal(root1, elements1);
        inOrderTraversal(root2, elements2);

        return elements1.equals(elements2);
    }

    private static void inOrderTraversal(TreeNode node, List<Integer> result) {
        if (node != null) {
            inOrderTraversal(node.left, result);
            result.add(node.value);
            inOrderTraversal(node.right, result);
        }
    }

    public static void main(String[] args) {
        // Example usage
        // Construct the first BST
        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(20);
        root1.left.left = new TreeNode(15);
        root1.right.right = new TreeNode(30);

        // Construct the second BST
        TreeNode root2 = new TreeNode(10);
        root2.left = new TreeNode(20);
        root2.right = new TreeNode(15);
        root2.left.left = new TreeNode(30);
        root2.right.right = new TreeNode(5);

        boolean result = areSameElements(root1, root2);
        System.out.println(result); // This should print true
    }
}
