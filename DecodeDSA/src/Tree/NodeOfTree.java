package Tree;

import java.sql.SQLOutput;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }

}


public class NodeOfTree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);


        a.left = b; a.right =c;
        b.left =d; b.right =e;
        c.right =f;

        Node g = new Node(10);
        Node h = new Node(20);
        c.left =g; e.right =h;

//        System.out.println(e.val);
        display(a);
        System.out.println();
//        a.left = null;
        System.out.println(sum(a));
        System.out.println(prod(a));
        System.out.println(max(a));
        System.out.println(size(a));
        System.out.println(levels(a));

    }
    //Sum
    private static int sum(Node root){
        if(root==null) return 0;
        return root.val+ sum(root.left) + sum(root.right);
    }
    // size
    private static int size(Node root){
        if(root==null) return 0;
        return 1+ size(root.left) + size(root.right);

    }

    // levels
    private static int levels(Node root){
        if(root==null) return 0;
        return 1+ Math.max(levels(root.left), levels(root.right));

    }

    //products
    private static int prod(Node root){
        if(root==null) return 1;
        return root.val * (prod(root.left) * prod(root.right));
    }

    // Prodduct of Non-zero elements
    private static int pro(Node root){
        if(root == null) return 1; // Return 1 for null to not affect multiplication
        int leftProduct = pro(root.left); // Product of left subtree
        int rightProduct = pro(root.right); // Product of right subtree
        // Multiply root value only if it's not zero
        return (root.val != 0 ? root.val : 1) * leftProduct * rightProduct;
    }

    //max
    private static int max(Node root){
        if(root==null) return  Integer.MIN_VALUE;
        int a = root.val, b = max(root.left), c = max(root.right);
//        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
        return Math.max(a,Math.max(b,c));
    }


    // display
    private  static  void display(Node root){
        if(root==null) return;
        System.out.println(root.val+" ");
        display(root.left);
        display(root.right);
    }

}
