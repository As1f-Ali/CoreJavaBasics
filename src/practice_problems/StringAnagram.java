package practice_problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to find its anagrams: ");
        String word = scanner.nextLine();

        Set<String> anagrams = getAnagrams(word);

        System.out.println("Anagrams of '" + word + "':");
        for (String s : anagrams) {
            System.out.println(s);
        }

        scanner.close();
    }

    public static Set<String> getAnagrams(String input) {
        Set<String> result = new HashSet<>();
        generateAnagrams("", input, result);
        return result;
    }

    private static void generateAnagrams(String prefix, String remaining, Set<String> result) {
        if (remaining.isEmpty()) {
            result.add(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                char current = remaining.charAt(i);
                String newPrefix = prefix + current;
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                generateAnagrams(newPrefix, newRemaining, result);
            }
        }
    }
}