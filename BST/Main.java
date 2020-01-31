import java.util.*;

class Node {

    public Node(int value)
    {
        this.value = value;
    }

    int value;
    Node leftNode = null;
    Node rightNode = null;
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nextInt ;
        Node root = null;
        for(int i=0;i<n;i++)
        {
            nextInt = scanner.nextInt();
            root = insertNode(root, nextInt);
        }

        System.out.println(findHeight(root));
        
        //inOrderPrint(root);
        int search = scanner.nextInt();
        if(binarySearchTree(root, search))
            System.out.println("Find");
        else
            System.out.println("Not find"); 
    }

    static int findHeight(Node root)
    {
       
        if(root == null)
            return 0; 

        int leftHeight = findHeight(root.leftNode);
        int rightHeight = findHeight(root.rightNode);

        return Math.max(leftHeight,rightHeight) +1;
    }

    static Node insertNode(Node root,int value)
    {
        if(root == null)
        {
            root = new Node(value);
            return root;
        }

        if(value<root.value)
            root.leftNode = insertNode(root.leftNode, value);
        else
            root.rightNode = insertNode(root.rightNode, value);

        return root;
    }

    static void inOrderPrint(Node root)
    {
        if(root != null){
            inOrderPrint(root.leftNode);
            System.out.println(root.value);
            inOrderPrint(root.rightNode);
        }
    }

    static boolean binarySearchTree(Node root,int value)
    {
        if(root == null)
            return false;

        if(root.value == value)
            return true;

        if(value > root.value)
            return binarySearchTree(root.rightNode, value);
        else
            return binarySearchTree(root.leftNode, value);
    }

}