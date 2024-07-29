// 1. Analyze if a stack IsEmpty or IsFull & if element is present return top element in the stack using templates. Also, perform push and pop operations on the stack.

import java.util.Scanner;

public class Stack<T> {

    private T[] arr; // Array to store elements
    private int top; // Index of the top element
    private final int capacity; // Maximum size of the stack

    public Stack(int size) {
        capacity = size;
        arr = (T[]) new Object[capacity]; // Create generic array
        top = -1; // Initially stack is empty
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(T item) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
            return;
        }
        arr[++top] = item; // Increment top and insert element
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return null;
        }
        return arr[top--]; // Return top element and decrement top
    }

    public T top() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return arr[top]; // Return top element without removing
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = scanner.nextInt();

        Stack<Integer> stack = new Stack<>(size); // Create stack of integers

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. Is Empty");
            System.out.println("5. Is Full");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    Integer popped = stack.pop();
                    if (popped != null) {
                        System.out.println("Popped element: " + popped);
                    }
                    break;
                case 3:
                    Integer topElement = stack.top();
                    if (topElement != null) {
                        System.out.println("Top element: " + topElement);
                    }
                    break;
                case 4:
                    System.out.println("Stack is empty: " + stack.isEmpty());
                    break;
                case 5:
                    System.out.println("Stack is full: " + stack.isFull());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
