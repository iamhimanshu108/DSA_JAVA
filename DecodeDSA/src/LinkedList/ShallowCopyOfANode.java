package LinkedList;

public class ShallowCopyOfANode {
    public static void main(String[] args) {

        Node a = new Node(100);
        Node temp = a; // shallow copy
//        Node temp = new Node(100); //deep copy
        System.out.println(a.val);
        System.out.println(temp.val);
    }
}
