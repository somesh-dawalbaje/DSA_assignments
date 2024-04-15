class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

   
    Node minValueNode(Node node) {
        Node current = node;

        
        while (current.left != null)
            current = current.left;

        return current;
    }

   
    Node inorderSuccessor(Node root, Node node) {
       
        if (node.right != null)
            return minValueNode(node.right);

        Node successor = null;

        
        while (root != null) {
            if (node.data < root.data) {
                successor = root;
                root = root.left;
            } else if (node.data > root.data) {
                root = root.right;
            } else {
                break;
            }
        }

        return successor;
    }
}

class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);

        Node node = tree.root.left.right;
        Node successor = tree.inorderSuccessor(tree.root, node);
        if (successor != null) {
            System.out.println("Inorder successor of " + node.data + " is " + successor.data);
        } else {
            System.out.println("No inorder successor found");
        }
    }
}
