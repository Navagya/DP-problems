class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}

public class deleteNode_BST {

    public static Node DeleteNode(Node root, int key){
        if(root==null) return null;

        if(key<root.val){
            root.left = DeleteNode(root.left,key);
        }
        else if(key>root.val){
            root.right = DeleteNode(root.right,key);
        }
        else{
            //key == root.val
            //if one child or leaf node
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            //if two children
            Node succ = inorderSuccessor(root.right);

            root.val = succ.val;

            root.right = DeleteNode(root.right,succ.val);

        }

        return root;
    } 


    public static Node inorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

     public static void inorder(Node root){
        if(root==null) return;

        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static void main(String args[]){
        Node root = new  Node(5);
        root.left = new Node (3);
        root.right = new Node (6);
        root.left.left = new Node (2);
        root.left.right = new Node (4);
        root.right.right = new Node (7);


        System.err.println("Before deletion: ");
        inorder(root);

        root = DeleteNode(root,3);
        System.err.println("After deletion: ");
        inorder(root);


    }
}
