package LinkedList;
class Node{
   int val;
   Node next;
   Node(int val){
       this.val = val;
   }
}
public class ListNodeClass {
    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node a  = new Node(10);
        Node b  = new Node(20);
        Node c  = new Node(30);
        Node d  = new Node(40);
        Node e  = new Node(50);
        Node f  = new Node(60);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Loop se print
//        Node temp = a;
//        while(temp!=null){
//            System.out.println(temp.val);
//            temp = temp.next;
//        }

        print(a);

//        System.out.println(a.val);
//        System.out.println(a.next.val);
//        System.out.println(a.next.next.val);
//        System.out.println(a.next.next.next.val);
    }
}
