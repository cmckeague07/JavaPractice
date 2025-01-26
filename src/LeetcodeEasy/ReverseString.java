package LeetcodeEasy;

public class ReverseString {
    public static String reverseString(String s) {
        // Using StringBuilder to reverse the string
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString();
    }
    //Manual method for string manipulation practice
    public static String reverseStringManual(String s) {
        // Convert string to a character array
        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        // Swap characters from both ends of the array
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        // Convert the character array back to a string
        return new String(chars);
    }


    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }
}
