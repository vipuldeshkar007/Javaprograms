package LinkedList;

public class DoublyLinkedList {

    class Node{

        Node prev;
        int data;
        Node next;
        public Node(int data) {
            this.head = null;
            this.data = data;
            this.prev = null;
        }
        private Node head;
    }
    private Node head;
    public void insertAtBeginning(int data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
    }
    public void insertAtEnd(int data){
        Node newNode =  new Node(data);
        if(head == null) {head = newNode; return;}
        Node temp = head;
        while(temp.next  != null) temp = temp.next;
        newNode.prev = temp;
        temp.next = newNode;

    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtEnd(19);
        dll.insertAtEnd(14);
        dll.insertAtEnd(13);
        dll.insertAtEnd(12);
        dll.insertAtEnd(32);
        dll.insertAtBeginning(30);
        dll.insertAtEnd(20);
        dll.insertAtBeginning(40);
        dll.insertAtBeginning(5);
        dll.display();
    }
}
