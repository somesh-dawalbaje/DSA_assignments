class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    TreeNode root;
    
    public BinaryTree() {
        this.root = null;
    }
    
    // Method to insert a new node into the binary tree
    public void insert(int val) {
        root = insertRecursive(root, val);
    }
    
    private TreeNode insertRecursive(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        
        if (val < root.val) {
            root.left = insertRecursive(root.left, val);
        } else if (val > root.val) {
            root.right = insertRecursive(root.right, val);
        }
        
        return root;
    }
    
    // Method to perform an in-order traversal of the binary tree
    public void inOrderTraversal() {
        inOrderTraversalRecursive(root);
    }
    
    private void inOrderTraversalRecursive(TreeNode root) {
        if (root != null) {
            inOrderTraversalRecursive(root.left);
            System.out.print(root.val + " ");
            inOrderTraversalRecursive(root.right);
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(7);
        binaryTree.insert(1);
        binaryTree.insert(4);
        
        System.out.println("In-order traversal of the binary tree:");
        binaryTree.inOrderTraversal(); // Output: 1 3 4 5 7
    }
}
