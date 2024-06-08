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
//        System.out.println(list.size);
//
//
//        list.display();
//        list.insertAtEnd(54);
        list.display();
//        System.out.println(list.size);


        list.insertAtHead(500);
        list.display();



    }
}
