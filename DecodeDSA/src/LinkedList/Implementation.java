package LinkedList;

import java.util.ArrayList;
import java.util.List;

class SLL{
    Node head;
    Node tail;
    int size;

    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else {
            tail.next = head;
            head = temp;
        }
        size++;
    }

    void insert(int idx, int val){

        if(idx==size){
            insertAtHead(val);
            return;
        }
//        if(idx==size){
//            insertAtTail(val);
//            return;
//        }
        if(idx>size){
            System.out.println("Invalid ");
            return;
        }
        Node temp = new Node(val);
        Node x =head;
        for (int i = 1; i <=idx-1; i++) {
            x = x.next;
        }

        // insertion
        temp.next = x.next;
        x.next = temp;
        size++;
    }

    int get(int idx) throws Error{
        if(idx==size-1) return  tail.val;
        if(idx>=size || idx<0){
            throw new Error("Invalid Index");
        }
        Node temp = head;
        for (int i=1; i<=idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }

    void deleteAtHead()
    {   if(head==null) throw new Error("List is Empty");
        head = head.next;
        size--;
    }



    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Implementation {

    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtEnd(10);
        list.insertAtEnd(10);
        list.insertAtEnd(10);
        list.insertAtEnd(30);
        list.insertAtEnd(10);

        list.insert(2,100);
        list.insert(5,100);
//        System.out.println(list.size);
//
//
//        list.display();
//        list.insertAtEnd(54);
        list.display();
//        System.out.println(list.size);


//        list.insertAtHead(500);
        list.display();

        System.out.println(list.get(2));
//        System.out.println(list.get(-1));
        list.deleteAtHead();
        list.display();




    }
}
