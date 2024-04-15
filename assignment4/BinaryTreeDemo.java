class BinaryTreeDemo{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }

    private static Node rootNode;

    BinaryTreeDemo(){
        rootNode=null;
    }

    public static void insert(int data){
        rootNode=insertData(rootNode,data);
    }

    public static Node insertData(Node rootNode, int data){
        if(rootNode==null){
            rootNode=new Node(data);
            return rootNode;
        }

        if(rootNode.data>data){
            rootNode.left=insertData(rootNode.left, data);
        }else if(rootNode.data<data){
            rootNode.right=insertData(rootNode.right, data);
        }

        return rootNode;
    }

    public static boolean search(int data){
        return searchNode(rootNode,data);
    }

    public static boolean searchNode(Node rootNode, int data){
        if(rootNode==null)
            return false;
        if(rootNode.data==data)
            return true;
        else if(data<rootNode.data){
            return searchNode(rootNode.left, data);
        }else{
            return searchNode(rootNode.right, data);
        }
    }

    public static void delete(int data){
        rootNode=deleteNode(rootNode,data);
    }
    
    public static Node deleteNode(Node rootNode, int data){
        if(rootNode==null){
            return null;
        }
        if(rootNode.data<data){
            rootNode.right=deleteNode(rootNode.right, data);
        }else if(rootNode.data>data){
            rootNode.left=deleteNode(rootNode.left, data);
        }else{
            if(rootNode.left==null)
                return rootNode.right;
            else if(rootNode.right==null)
                return rootNode.left;

            rootNode.data=minVal(rootNode.right);
            rootNode.right=deleteNode(rootNode.right, rootNode.data);
        }
        return rootNode;
    }

    public static int minVal(Node rootNode){
        int min=rootNode.data;
        while (rootNode.left!=null) {
            min=rootNode.left.data;
            rootNode=rootNode.left;
        }
        return min;
    }
    public static void display(){
        inorderTraversal(rootNode);
        //preorderTraversal(rootNode);
        //postorderTraversal(rootNode);
        System.out.println();
    }

    public static void inorderTraversal(Node rootNode){
        if(rootNode!=null){
            inorderTraversal(rootNode.left);
            System.out.print(rootNode.data+" ");
            inorderTraversal(rootNode.right);
        }
        
    }

    public static void preorderTraversal(Node rootNode) {
        if (rootNode == null)
            return;

        System.out.print(rootNode.data + " ");
        preorderTraversal(rootNode.left);
        preorderTraversal(rootNode.right);
    }

    public static void postorderTraversal(Node rootNode) {
        if (rootNode == null)
            return;

        postorderTraversal(rootNode.left);
        postorderTraversal(rootNode.right);
        System.out.print(rootNode.data + " ");
    }

    public static void main(String[] args) {
        BinaryTreeDemo bt=new BinaryTreeDemo();
        bt.insert(45);
        bt.insert(48);
        bt.insert(12);
        
        bt.display();
        System.out.println(bt.search(45));
        System.out.println(bt.search(55));
        bt.delete(12);
        bt.display();
        
    }
}