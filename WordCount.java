import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        System.out.println();
        String input = sc.nextLine();

        // Split the input into words using whitespace as delimiter
        String[] words = input.split("\\s+");

        int wordCount = 0;

        // Count occurrences of each word
        for (String word : words) {
            if (word != null && !word.isEmpty()) {
                wordCount++;
            }
        }

        System.out.println("Total words: " + wordCount);
    }
}
