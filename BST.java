import java.util.*;

class Node{

    int val; 
    Node left;
    Node right;

    Node(int val){
        this.val =  val;
        left = null;
        right = null;
    }
}



public class BST{

    public static Node insertNode (Node root, int val){
        if(root==null){
            return new Node(val);
        }

        if(val<root.val){
            root.left = insertNode(root.left,val);
        }

        if(val>root.val){
            root.right = insertNode(root.right,val);
        }

        return root;
    }

    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.println(root.val + " ");
        inorder(root.right);
    }

    public static void main(String args []){
        Scanner sc = new Scanner (System.in);

        System.out.println("Number of nodes: ");
        int n=sc.nextInt();

        //insert values in BST
        Node root = null;
        System.out.println("Enter values: ");
       for(int i=0;i<n;i++){
        int val = sc.nextInt();
        root = insertNode(root,val);
       }

       System.out.println("Inorder traversal: ");
       inorder(root);
    }
}