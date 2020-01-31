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

        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        Node lca = lca(root, v1, v2);
        System.out.println(lca.value);
    
    }

    static Node lca(Node root,int v1,int v2)
    {
        if(v1 == root.value || v2 == root.value)
            return root;
        if(v1 < root.value && v2 < root.value){
            return lca(root.leftNode, v1, v2);
        } else if(v1 > root.value && v2 > root.value){
            return lca(root.rightNode, v1, v2);
        } else{
            return root;
        }    
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

}