package LinkedList;

import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

public class DisplayRecusrive {
    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void printRecursive(Node head){
       if(head==null) return;
        System.out.println(head.val);
        printRecursive(head.next);
    }

    // Hw

    public static void Display(Node head){
        if(head==null) return;
        Display(head.next);
        System.out.print(head.val+ " ");

    }


    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;


        printRecursive(a);
        Display(a);
    }
}
