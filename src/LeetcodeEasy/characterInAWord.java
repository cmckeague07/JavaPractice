package LeetcodeEasy;

public class characterInAWord {

    public static boolean characterInWord(String word, String character) {
        // Normalize to lower case for case-insensitive comparison
        String myWord = word.toLowerCase();
        String myChar = character.toLowerCase();

        // Iterate through each character in the word
        for (int i = 0; i < myWord.length(); i++) {
            if (myWord.charAt(i) == myChar.charAt(0)) {
                return true; // Return true as soon as the character is found
            }
        }
        return false; // Return false if the character is not found
    }

    public static void main(String[] args) {
        String myWord = "Elephant";
        String character = "E";

        boolean isFound = characterInWord(myWord, character);

        if (isFound) {
            System.out.println("Character found!");
        } else {
            System.out.println("Character not found.");
        }
    }

}
