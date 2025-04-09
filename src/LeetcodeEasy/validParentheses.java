package LeetcodeEasy;

import java.util.Stack;

public class validParentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // If opening bracket, push it to the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If stack is empty, it's invalid
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Now check match directly, no '!'
                if (isMatching(top, ch)) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        // If stack is empty at the end, it's valid
        return stack.isEmpty();
    }

    private static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String test = "({[]})";
        System.out.println("Is valid? " + isValid(test));  // Should print: true
    }
}
