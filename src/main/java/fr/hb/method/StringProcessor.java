package fr.hb.method;

public class StringProcessor {
    public static int wordsCount(String serie) {
        if (serie == null || serie.isEmpty()) {
            return 0;
        }
        String[] words = serie.trim().split("\\s+");
        return words.length;
    }

    public static String reverser(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    public static boolean palindromic(String word) {
        String reversed = reverser(word);
        return word.equalsIgnoreCase(reversed);
    }

}
