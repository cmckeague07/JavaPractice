package LeetcodeEasy;

public class WordCounter {
    public static int countWordOccurrence(String sentence, String targetWord) {
        // Normalize the sentence and target word to lower case for case-insensitive comparison
        sentence = sentence.toLowerCase();
        targetWord = targetWord.toLowerCase();

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Count occurrences
        int count = 0;
        for (String word : words) {
            if (word.equals(targetWord)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String sentence = "This is a test sentence. This sentence is just a test.";
        String targetWord = "test";

        int occurrences = countWordOccurrence(sentence, targetWord);
        System.out.println("The word '" + targetWord + "' appears " + occurrences + " times.");
    }
}
