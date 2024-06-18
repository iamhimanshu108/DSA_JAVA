package Tree;

public class Traversal {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);

        a.left = b; a.right =c;
        b.left =d; b.right =e;
        c.left =f; c.right =g;
        e.left = h; f.right =i;

        display(a);
        System.out.println("pre");
        preorder(a);
        System.out.println("in");
        inorder(a);
        System.out.println("post");
        postorder(a);
    }
// Display
    private  static  void display(Node root){
        if(root==null) return;
        System.out.println(root.val+" ");
        display(root.left);
        display(root.right);
    }
    //preorder
    private  static  void preorder(Node root){
        if(root==null) return;
        System.out.println(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    // inorder
    private  static  void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.println(root.val+" ");
        inorder(root.right);
    }
    //postorder
    private  static  void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val+" ");
    }
}
