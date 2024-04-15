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

    
    void printHeadNodes(Node node) {
        if (node != null) {
            System.out.println("Head node of " + node.data + " is " + getHeadNode(node).data);
            printHeadNodes(node.left);
            printHeadNodes(node.right);
        }
    }

    // Function to get the head node of a given node
    Node getHeadNode(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }
}

class Demo{
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);

        tree.printHeadNodes(tree.root);
    }
}
