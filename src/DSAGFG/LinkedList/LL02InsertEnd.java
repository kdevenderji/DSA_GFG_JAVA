package DSAGFG.LinkedList;

public class LL02InsertEnd {   //ek class banayge
    Node head;                 // node ko initial kr dange
    class Node{                 //  ek Node ki class banayge
        int data ;              // jo v data insert krage wo integer type ka hoga
        Node next;

        Node(int d){
            data=d;
            next= null;
        }
    }

    // Implementation of Node at the End
    // then we have to make a class

    public void insertAtEnd(int  newData){
        Node newNode = new Node(newData);

        //we have to check ki linkklist null to nahi h
        if( head == null){
            head = new Node(newData);
            return;
        }
        // if link list is not empty
        newNode.next =null;
        Node temp = head;
        while (temp.next != null){
            temp=temp.next;
        } temp.next = newNode;
        return;
    }

    // implementation of displaying the linklist

    public void displayLL(){
        Node current = head;
        while (current!=null){
            System.out.print(current.data+ " ");
            current= current.next;
        }

}
        public static void main(String []  args ){
            LL02InsertEnd llist=new LL02InsertEnd();
            llist.insertAtEnd(2);
            llist.insertAtEnd(4);
            llist.insertAtEnd(8);


            System.out.println("Before Insertion of 10");
            llist.displayLL();
            System.out.println();

            llist.insertAtEnd(10);
            System.out.println("After Insertion of 10");
        llist.displayLL();
            System.out.println();
}
}
