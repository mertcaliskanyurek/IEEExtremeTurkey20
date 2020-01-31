import java.util.*;

class Node {

    public Node(int value)
    {
        this.value = value;
    }

    int value;
    Node leftNode=null;
    Node rightNode=null;
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //int[] arr = new int[n];
        Node root = null;
        for(int i=0;i<n;i++)
            root = insertValue(root,s.nextInt());
        
        inOrder(root);
        s.close();
    }

    static Node insertValue(Node currNode,int value)
    {
        if(currNode == null)
        {
            currNode = new Node(value);
            return currNode;
        }

        if(value>currNode.value)
            currNode.rightNode = insertValue(currNode.rightNode, value);
        else
            currNode.leftNode = insertValue(currNode.leftNode, value);
        
        return currNode;
    }

    static void inOrder(Node root)
    {
        if(root != null)
        {
            inOrder(root.leftNode);   
            System.out.println(root.value);
            inOrder(root.rightNode);
        }
    }

}