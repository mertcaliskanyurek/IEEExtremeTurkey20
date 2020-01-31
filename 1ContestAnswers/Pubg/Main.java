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
    }

    static int findHeight(Node root)
    {
        //orjinal bst yükseklik bulamda -1 dondurulur 
        //cunki kok dugum tek basına yuksekligi 0 sayilir
        //fakat biz en sonunda +1 ekliyoruz 
	//bunu dengelemek icin -1 dondurulur
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

}