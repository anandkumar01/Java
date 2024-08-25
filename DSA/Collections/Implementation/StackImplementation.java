package DSA.Collections.Implementation;

import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> stack = new Stack<>();

        System.out.println("Stack: " + stack);
        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Stack is empty: " + isEmpty);

        // Pushing elements onto the stack
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("JavaScript");
        stack.push("Ruby");

        // Displaying the stack
        System.out.println("Stack: " + stack);

        // Checking the size of the Stack
        System.out.println("Size of the Stack: " + stack.size());

        // Checking the element at the top of the stack
        String topElement = stack.peek();
        System.out.println("Element at the top: " + topElement);

        // Popping elements from the stack
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        
        System.out.println("Stack after pop: " + stack);

        // Checking if the stack is empty
        isEmpty = stack.isEmpty();
        System.out.println("Stack is empty: " + isEmpty);

        // Searching for an element in the stack
        int position = stack.search("Python");
        if (position != -1) {
            System.out.println("Python is at position: " + position);
        } else {
            System.out.println("Python is not in the stack");
        }

        // Iterating over elements using a for-each loop
        System.out.print("Stack elements: ");
        for (String element : stack) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Clearing the stack
        stack.clear();
        System.out.println("Stack after clearing: " + stack);
    }
}
