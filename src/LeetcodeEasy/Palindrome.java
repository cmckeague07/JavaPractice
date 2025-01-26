package LeetcodeEasy;

public class Palindrome {
    public static boolean palindromeProblem(String sentence) {
        // Remove all non-alphanumeric characters and convert to lowercase
        String sanitized = sentence.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Create a StringBuilder for reversing
        StringBuilder reversed = new StringBuilder(sanitized);

        // Check if the original sanitized string equals the reversed one
        return sanitized.equals(reversed.reverse().toString());
    }

    public static void main(String[] args) {
        String mysentence = "A man, a plan, a canal, Panama!";
        // Check if the sentence is a palindrome
        boolean isPalindrome = palindromeProblem(mysentence);

        // Output result
        System.out.println("Is the sentence a palindrome? " + isPalindrome);
    }
}
