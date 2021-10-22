class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedList {

    static Node head;

    /* Insert Node */
    static void add(int data) {
        Node toAdd = new Node(data);
        if (head == null) {
            head = toAdd;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = toAdd;
        }
    }

    /* insert Athead */
    static void insertAtHead(int data) {
        Node addHead = new Node(data);
        if (head == null) {
            head = addHead;
            System.out.println("New Head inserted");
        } else {
            addHead.next = head;
            head = addHead;
            System.out.println("New Head inserted");
        }
    }

    /* insertAt tail */
    static void insertAtTail(int data) {
        Node addTail = new Node(data); // --> data || next
        Node lastNode = head;
        while (lastNode == null) {
            lastNode = lastNode.next;
        }
        lastNode.next = addTail;
        System.out.println("The node has been inserted !!");
    }

    /* insertAt Mid */
    static void insertAtMid(int data, int location) {
        Node addNode = new Node(data);
        Node lastNode = head;
        int currLoc = 0;
        while(currLoc < location - 1){
            lastNode = lastNode.next;
            currLoc ++;
        }
        Node currNode = lastNode.next;
        addNode.next = currNode;
        lastNode.next = addNode;
    }

    /* print linkedlist */
    static void printList() {
        if (head == null) {
            System.out.println("The node've no value !!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        // insertAtHead(5);
        add(10);
        add(20);
        add(30);
        // insertAtTail(40);
        insertAtMid(50,1);
        printList();

    }
}
