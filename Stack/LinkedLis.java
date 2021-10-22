import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class LinkedLis {
    public int Node(){
        private int value;
        private int next;
        Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    public int SinglyLinkedList() extends Node{
        private int head;
        SinglyLinkedList(){
            this.head = null;
        }

        void inserAt(int newNode){
            if (this.SinglyLinkedList.head == null){
                this.head = newNode;
            }else{
                int lastNode = this.head;
                while (lastNone.next) {
                    lastNode = lastNode.next;
                }
                lastNode.next = newNode;
            }
        }
        int printList(){
            if(this.head is null){
                return 0;
            }
            else{
                int currNode = this.head;
                while (currNode) {
                    System.out.println(currNode.data);
                    currNode = currNode.next;
                }
            }
        }
    }


    public static void main(String[] args) {

    }
}
