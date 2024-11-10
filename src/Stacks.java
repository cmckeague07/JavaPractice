import java.util.Stack;

public class Stacks {

    /**
     * Last-In-First-Out (LIFO): Elements are added and removed from the top.
     * Use Cases: Great for tasks like parsing, function call management, or undo mechanisms.
     * Core Operations: push(), pop(), and peek().
     * pop() removes the value at the top of the stack
     * push() adds a value to the top of the stack
     * peek() prints the value at the top of the stack
     */
    public static void main(String[]args){
        Stack<Integer> stacks = new Stack<>();
        stacks.push(1);
        System.out.println(stacks.peek());
        stacks.pop();
        stacks.search(1);

        if (stacks.isEmpty()) {
            System.out.println("Stack is empty");
        }

        for (int item : stacks) {
            System.out.println(item);
        }
    }
}
