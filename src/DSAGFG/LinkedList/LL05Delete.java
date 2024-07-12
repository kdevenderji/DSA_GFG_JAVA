package DSAGFG.LinkedList;

public class LL05Delete {


    static class Node{
        int data;
        Node next;

        Node(int x){
            data= x;
            next = null;

        }
    }
    // Delete At Begin

    static Node deleteAtBegin(Node head) {
        if (head == null) {
            return head;
        }

        Node temp = head;
        head = head.next;
        temp = null; // optional in Java due to automatic garbage collection

        return head;
    }

    // Insert at Given Position in between LinkedLis

    public static Node insertAtPos (Node head, int x, int pos){
        if (pos == 1) {
            head = insertAtBegin(head, x);
            return head;
        }
        Node temp1 = head, temp2 = null;
        temp2 = new Node(x);

        for (int i = 1; i <= pos - 2; i++) {
            temp1 = temp1.next;
        }
        temp2.next = temp1.next;
        temp1.next = temp2;
        return head;

    }


    // Insertion at end  2nd Step
    public static Node insertAtEnd(Node head, int x){
        if(head==null){
            head= new Node(x);
            return head;
        }
        Node temp= head;
        while(temp.next != null){
            temp= temp.next;

        }
        temp.next = new Node(x);
        return head;
    }
    // insert at Begin 1st step
    public static Node insertAtBegin(Node head, int x){
        Node temp = new Node(x);          //      create a new node

        /*       its call this constractor form line 9  Node(int x){
            data= x;
            next = null;
       */
        temp.next=head;
        head=temp;
        return head;

    }

    public static void traverse ( Node head){                 // Traverse Function
        while(head != null)
        {
            System.out.print(head.data+" ");
            head= head.next;

        }
        System.out.println();
    }


// Delete the node at End

    static Node deleteAtEnd(Node head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            head = null;
            return head;
        }

        Node t1 = head, temp = null;

        while (t1.next.next != null) {
            t1 = t1.next;
        }

        temp = t1.next;
        t1.next = null;
        temp = null; // optional in Java due to automatic garbage collection

        return head;
    }
    static Node insertAtRandomPos(Node head, int pos, int x) {
        if (pos == 1) {
            head = insertAtBegin(head, x);
            return head;
        }

        Node temp = new Node(x);
        Node t1 = head;

        for (int i = 1; i <= pos - 2; i++) {
            t1 = t1.next;
        }

        temp.next = t1.next;
        t1.next = temp;

        return head;
    }
    static Node deleteAtRandomPos(Node head, int pos) {
        if (pos == 1) {
            head = deleteAtBegin(head);
            return head;
        }

        Node t1 = head, temp = null;

        for (int i = 1; i <= pos - 2; i++) {
            t1 = t1.next;
        }

        temp = t1.next;

        if (t1.next != null) {
            t1.next = t1.next.next;
        }

        temp = null; // optional in Java due to automatic garbage collection

        return head;
    }


    public static void main(String [] args){
        Node head=null;

        // traverse and insert at Begin 1st step
        head = insertAtBegin(head, 2);
        head = insertAtBegin(head, 4);
        head = insertAtBegin(head, 8);
        head= insertAtBegin(head, 10);

        traverse(head);

        // traver and insert value at end 2nd step

        head = insertAtEnd(head, 100);
        head= insertAtEnd(head, 200);
        head = insertAtEnd(head, 300);

        traverse (head);

        head= insertAtPos(head, 500, 5);
        traverse(head);

        head= deleteAtBegin(head);
        traverse (head);


        head= deleteAtEnd(head);
        traverse(head);   //traverse the linked list

        head= deleteAtRandomPos(head, 5);
        traverse(head);

    }

}




