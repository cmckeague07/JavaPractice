package LeetcodeEasy;

public class ReverseIndividualWord {

    public static String reverseString(String sentence, String word) {
        String[] sentenceArray = sentence.split("\\s+");  // Split sentence into words

        for (int i = 0; i < sentenceArray.length; i++) {
            // If the current word matches the target word, reverse it
            if (sentenceArray[i].equals(word)) {
                StringBuilder myFoundWord = new StringBuilder(sentenceArray[i]);
                sentenceArray[i] = myFoundWord.reverse().toString();  // Reverse and update the word
            }
        }

        // Rebuild the sentence from the modified words
        return String.join(" ", sentenceArray);  // Join the words back with spaces
    }

    public static void main(String[] args) {
        String mySentence = "The fox jumps over the hedge";
        String myWord = "jumps";
        System.out.println(reverseString(mySentence, myWord));  // Print the modified sentence
    }
}
