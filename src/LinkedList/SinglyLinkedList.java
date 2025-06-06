package LinkedList;

public class SinglyLinkedList {

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        Node headTemp = head;
        head = newNode;
        head.next = headTemp;
    }
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null) {head = newNode; return;}
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+  " -> " );
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertAtEnd(10);
        sll.insertAtEnd(20);
        sll.insertAtEnd(30);
        sll.insertAtBeginning(5);
        sll.insertAtBeginning(50);
        sll.display();
    }

}

