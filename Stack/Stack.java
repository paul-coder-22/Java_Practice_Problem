public class Stack {
    static final int MAX = 1000;
    int top;
    int[] arr = new int[MAX];

    boolean isEmpty() {
        return (top < 0);
    }

    Stack() {
        top = -1;
    }

    void push(int x) {
        if (top >= MAX-1) {
            System.out.println("The stack is overflow !!");
        } else {
            arr[++top] = x;
            System.out.println("The element get inserted !!");
        }
    }

    void pop() {
        if (top < 0) {
            System.out.println("The stack is empty !!!");
        } else {
            int x  = arr[--top];
            System.out.println("The element get popped --> " + x);
        }
    }

    void peek() {
        if (top < 0) {
            System.out.println("The stack is empty !!");
        } else {
            int x = arr[--top];
            System.out.println("Found elemnet --> " + x);
        }
    }

    public static void main(String[] args) {
        Stack sc = new Stack();
        sc.push(10);
        sc.push(20);
        sc.push(30);
        sc.pop();
        sc.peek();
    }
}
