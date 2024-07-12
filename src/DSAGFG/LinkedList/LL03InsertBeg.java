package DSAGFG.LinkedList;

public class LL03InsertBeg {
    Node head;

    class Node {
        int data;
        LL03InsertBeg.Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Implementation of Node at the End
    // then we have to make a class

    public void insertAtEnd(int newData) {
        LL03InsertBeg.Node newNode = new LL03InsertBeg.Node(newData);

        //we have to check ki linkklist null to nahi h
        if (head == null) {
            head = new LL03InsertBeg.Node(newData);
            return;
        }
        // if link list is not empty
        newNode.next = null;
        LL03InsertBeg.Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }
    //2nd part  Implementation at the Beginning
    public void insertAtBeginning(int newData){
        Node newNode= new Node(newData);
        newNode.next=head;
        head= newNode;
    }
    // till thiss

    // 3rd Insert at in betweeen list
    public void insertAfter(Node prev_node, int newData){
        if(prev_node == null){
            System.out.println("The previous node cannot contain null values");
            return;
        }

        Node newNode= new Node(newData);
        newNode.next = prev_node.next;
        prev_node.next= newNode;
    }

    // implementation of displaying the linklist

    public void displayLL() {
        LL03InsertBeg.Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }

    public static void main(String[] args) {
        LL03InsertBeg llist = new LL03InsertBeg();
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(8);


        System.out.println("Before Insertion of 10");
        llist.displayLL();
        System.out.println();

        llist.insertAtEnd(10);

        //insertion at beggining ka data

        llist.insertAtBeginning(1);


        System.out.println("After Insertion of 10");
        llist.displayLL();
        System.out.println();

        llist.insertAfter(llist.head.next,  13);
        llist.displayLL();
        System.out.println();
    }
}