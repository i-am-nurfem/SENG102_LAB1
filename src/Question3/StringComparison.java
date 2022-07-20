package Question3;

import java.util.Arrays;
import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        String words;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two strings to compare if they are equal or not: ");
        words = scanner.nextLine();

        CompareLength(words);
    }

    public static void CompareLength(String _words) {
        String word1, word2;

        String[] words = _words.split(" ");
        word1 = words[0];
        word2 = words[1];

        if (word1.length() > word2.length()) {
            System.out.println(word1);
        }
        else if(word1.length() < word2.length()){
            System.out.println(word2);
        }
        else {
            System.out.println("They have the same length");
        }

    }
}
